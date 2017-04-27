
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;

public class RasterGraphics {
  public static ColourPalette palette;

  public static void main(String[] args) {

    RGMain.createAndShow();
  }
}

class RGMain {
  private static JFrame rgFrame;
  private static JPanel rgContainerPanel;
  private static RGImageCanvas rgImageCanvas;
  private static JPanel rgColourPanel;
  private static byte selectedColourIndex;
  private static RGImage rgImage;
  private static RGColourPalette rgColourPalette;

  private RGMain() { }

  public static void createAndShow() {
    rgFrame = new RGFrame();
    rgFrame.setDefaultCloseOperation(rgFrame.EXIT_ON_CLOSE);
    
    rgImage = new RGImage(100, 100);
    rgColourPalette = rgImage.getColourPalette();
    selectedColourIndex = 0;

    rgContainerPanel = new JPanel();
    rgImageCanvas = new RGImageCanvas(255, 255);

    rgColourPanel = new RGColourPanel(rgColourPalette);

    rgFrame.addMouseListener(rgImageCanvas);
    rgFrame.addMouseMotionListener(rgImageCanvas);

    rgContainerPanel.add(rgImageCanvas);
    rgContainerPanel.add(rgColourPanel);

    rgFrame.add(rgContainerPanel);

    rgFrame.pack();
    rgFrame.setVisible(true);
  }

  public static RGImage getImage() {
    return rgImage;
  }

  public static void setSelectedColourIndex(byte index) {
    selectedColourIndex = index;
  }

  static class RGImageCanvas extends JPanel implements MouseListener,MouseMotionListener {
    private int height, width;

    public RGImageCanvas(int w, int h) {
      width = w;
      height = h;

      Dimension size = new Dimension(w, h);
      setMaximumSize(size);
      setPreferredSize(size);
      setMinimumSize(size);
    }

    public void mouseClicked(MouseEvent e) { }

    public void mouseDragged(MouseEvent e) {
      int x = e.getX() - getX();
      int y = e.getY() - getY();

      for (int i = x - 3; i <= x + 3; i++) {
        for (int j = y - 3; j <= y + 3; j++) {
          RGMain.getImage().setPixel(i,  j, selectedColourIndex);
        }
      }
      repaint();   
    }

    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }
    public void mouseMoved(MouseEvent e) { } 
    public void mousePressed(MouseEvent e) { 
      int x = e.getX() - getX();
      int y = e.getY() - getY();

      for (int i = x - 3; i <= x + 3; i++) {
        for (int j = y - 3; j <= y + 3; j++) {
          RGMain.getImage().setPixel(i,  j, selectedColourIndex);
        }
      }
      repaint();   
    }

    public void mouseReleased(MouseEvent e) { } 

    public void paint(Graphics g) {
      rgImage = RGMain.getImage();

      for (int x = 0; x < width; x++) {
        for (int y = 0; y < height; y++) {
          g.setColor(rgImage.getPixelColour(x, y));
          g.drawLine(x, y, x, y);
        }
      }
    }
  }

  static class RGColourPanel extends JPanel {
    
    public RGColourPanel(RGColourPalette palette) {
      Dimension size = new Dimension(40, 255);
      setMaximumSize(size);
      setPreferredSize(size);
      setMinimumSize(size);

      int colourBoxSize = 15;
      List<Color> paletteColours = palette.getColours();
      for (byte i = 0; i < paletteColours.size(); i++)
        add(new RGColourBox(paletteColours.get(i), colourBoxSize, i));
    }
  }

  static class RGColourBox extends JLabel {
    private Color colour;
    private byte colourIndex;
    public RGColourBox(Color c, int size, byte index) {
      setOpaque(true);
      setBackground(c);
      setBorder(BorderFactory.createLineBorder(Color.BLACK));
      setPreferredSize(new Dimension(size, size));

      colourIndex = index;
      
      addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          RGMain.setSelectedColourIndex(colourIndex);
        }
      });
    }
  }
}

class RGColourPalette { 
  List<Color> colours;

  public RGColourPalette(Color[] cs) {
    colours = new ArrayList<Color>();
    for (Color c : cs)
      colours.add(c);
  }

  public Color getColour(int index) {
    if (isValidIndex(index))
      return colours.get(index);
    return Color.BLACK;
  }

  public List<Color> getColours() {
    return colours;
  }

  public void setColour(int index, Color colour) {
    if (isValidIndex(index))
      colours.set(index, colour);
  }

  private boolean isValidIndex(int index) {
    return (index >= 0) && (index < colours.size());
  }
}

class RGImage { 
  private byte[][] pixels;
  private int height, width;
  private RGColourPalette palette;

  public RGImage(int w, int h) {
    width = w;
    height = h;
    pixels = new byte[height][width];

    Color[] colours = {Color.BLACK, Color.WHITE, Color.BLUE, Color.RED, Color.GREEN, Color.ORANGE, Color.CYAN, Color.GRAY};
    palette = new RGColourPalette(colours);

    for (int x = 0; x < w; x++) {
      for (int y = 0; y < h; y++) {
        pixels[y][x] = (byte) (Math.random() * colours.length);
      }
    }
  }

  public RGImage(int w, int h, RGColourPalette p) {
    width = w;
    height = h;
    pixels = new byte[height][width];
    palette = p;
  }

  public RGImage(byte[][] pixels, RGColourPalette p) {
    height = pixels.length;
    width = pixels[0].length;
    palette = p;
  }

  public RGColourPalette getColourPalette() {
    return palette;
  }

  public byte getPixel(int x, int y) {
    if (isValidPixel(x, y))
      return pixels[y][x];
    return 0;
  }

  public void setPixel(int x, int y, byte val) {
    if (isValidPixel(x, y))
      pixels[y][x] = val; 
  }

  public Color getPixelColour(int x, int y) {
    return palette.getColour(getPixel(x, y));
  }

  private boolean isValidPixel(int x, int y) {
    return ((y >= 0) && (y < pixels.length) && (x >= 0) && (x < pixels[0].length));
  }
}