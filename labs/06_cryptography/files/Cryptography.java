/**
 * Cryptography Lab (Template Classes and Test Cases)
 * These are the template classes and test cases for the Cryptography Lab.
 * Written for the Woodstock School in Mussoorie, Uttarakhand, India.
 *
 * @author Jeffrey Santos
 * @version 1.0
 */

public class Cryptography {
  public static void main(String[] args) {
    //  Tests for OneTimePad
    //    Note: These tests assume the use of each of the required helper
    //          methods and do not test them directly.
    //    Output: Output should vary based on the random nature of the
    //            generated keys.
    OneTimePad otp = new OneTimePad();
    String encryptedMessage = otp.encryptMessage("Hello, World!");
    //  Output: Should output 'gibberish' of equal length to 'Hello, World!'
    System.out.println(encryptedMessage);
    //  Output: Should output null
    System.out.println(otp.encryptMessage("Goodbye, World!"));
    //  Output: Should output 'Hello, World!'
    System.out.println(otp.decryptMessage(encryptedMessage));
    //  Output: Should output 'gibberish' of equal length to 'Hello, World!';
    //          however, the output should be distinct from the first call to
    //          the encryptMessage() method.
    System.out.println(otp.encryptMessage("Hello, World!"));

    //  Tests for RSADecrypter and RSAEncrypter
    //    Note: These tests assume the use of each of the required helper
    //          methods and do not test them directly.
    //    Output: Unlike the OneTimePad, keys are not generated randomly, so
    //            outputs should match exactly.
    RSADecrypter rsad = new RSADecrypter(1013839, 67866833, 47);
    //  Output: "68806042101887, 47"
    long[] publicKey = rsad.getPublicKey();
    System.out.println(publicKey[0] + ", " + publicKey[1]);

    //  Output: "1010100000111010110011111010110110111011110100"
    RSAEncrypter rsae = new RSAEncrypter(publicKey);
    encryptedMessage = rsae.encryptMessage("Tests");
    System.out.println(encryptedMessage);

    //  Output: "Tests"
    System.out.println(RSADecrypter.decryptMessage(encryptedMessage));
  }
}

/**
 * The Encrypter interface provides access to the encryptMessage method.
 */
interface Encrypter {
  /**
   * Encrypts a given message and returns the cipher text.
   *
   * @param message The message to be encrypted.
   * @return  The ciphertext after applying the encryption method.
   */
  public String encryptMessage(String message);
}

/**
 * The Decrypter interface provides access to the decryptMessage method.
 */
interface Decrypter {
  /**
   * Decrypts a given message and returns the original text.
   *
   * @param message The ciphertext to be decrypted.
   * @return  The deciphered message text.
   */
  public String decryptMessage(String message);
}

/**
 * The OneTimePad class implements the one-time pad digital encryption technique
 * decribed in Activity #1. The class implements both the Encrypter and
 * Decrypter interfaces.
 */
class OneTimePad implements Encrypter, Decrypter {
  private String encryptionKey;   // the current encryption key
  private boolean isReady;        // indicates readiness for encryption

  /**
   * OneTimePad class constructor. The class constructor should generate a
   * random key to be used the first time a message is encrypted with this
   * class.
   */
  public OneTimePad() {
    //  To be implemented in Activity #1
  }

  /**
   * The encryptMessage method required by the Encrypter interface.
   *
   * @param message The message to be encrypted.
   * @return  The ciphertext after applying the one-time pad encryption
   *          technique described in Activity #1 or null if the encryption
   *          process cannot take place.
   */
  public String encryptMessage(String message) {
    //  To be implemented in Activity #1
    return null;
  }

  /**
   * The decryptMessage method required by the Decrypter interface.
   *
   * @param message The ciphertext to be decrypted.
   * @return  The deciphered message text.
   */
  public String decryptMessage(String message) {
    //  To be implemented in Activity #1
    return null;
  }

  /**
   * Helper method to generate a random binary string to act as a key.
   *
   * @param bitLength The number of bits the binary string should contain.
   * @return  A random binary string of bitLength bits.
   */
  private String generateRandomKey(int bitLength) {
    //  To be implemented in Activity #1
    return null;
  }

  /**
   * Helper method to create an Extended ASCII encoded string from a given
   * binary string.
   *
   * @param msgBitString The binary string to encode.
   *  Precondition: msgBitString is a binary string.
   * @return An string representing the binary string encoded in Extended
   *         ASCII.
   */
  private String binaryToString(String msgBitString) {
    //  To be implemented in Activity #1
    return null;
  }

  /**
   * Helper method to split a binary string into strings of a given length.
   *
   * @param msgBitString The binary string representing the message.
   * @param bitLength The number of bits to divide the string into.
   * @return  An array of binary strings, each <= bitLength in length.
   */
  private String[] splitMessage(String msgBitString, int bitLength) {
    //  To be implemented in Activity #1
    return null;
  }

  /**
   * Helper method to create a binary string out of a given string of
   * characters.
   *
   * @param msgString The message to convert to a binary string.
   *  Precondition: msgString is encoded in Extended ASCII
   * @return  A binary string representing the message string.
   */
  private String stringToBinary(String msgString) {
    //  To be implemented in Activity #1
    return null;
  }

  /**
   * Helper method to XOR bits in an array of binary strings
   * with the corresponding bits in the encryptionKey.
   *
   * @param msgBitStrings An array of binary strings to XOR.
   *  Precondition: Each string is a binary string of length <= the length of
   *                the encryptionKey binary string.
   * @return  An array of binary strings resulting from XORing the given
   *          strings with the encryptionKey string.
   */
  private String[] XORStrings(String[] msgBitStrings) {
    //  To be implemented in Activity #1
    return null;
  }
}

/**
 * The RSADecrypter class implements the private side of the RSA cryptosystem.
 * It implements the Decrypter interface.
 */
class RSADecrypter implements Decrypter {
  private final long n, e, d; // relevant information for the public-private
                              // keys of the RSA cryptosystem

  /**
   * RSADecrypter class constructor. Accepts the two prime numbers and desired
   * exponent for the public key. n and d should be calculated based on these
   * parameters.
   *
   * @param p The first prime number to use for the RSA cryptosystem.
   *  Precondition: p is prime
   * @param q The second prime number to use for the RSA cryptosystem.
   *  Precondition: q is prime
   * @param e The exponent for the public-key of the RSA cryptosystem.
   *  Precondition: e is relatively prime to (p - 1)(q - 1)
   */
  public RSADecrypter(long p, long q, long e) {
    //  To be implemented in Activity #2
    n = 0; this.e = 0; d = 0;
  }

  /**
   * Accessor method for the public-key pair: (n, e).
   *
   * @return  An array containing the public-key pair: (n, e).
   */
  public long[] getPublicKey() {
    //  To be implemented in Activity #2
  }

  /**
   * The decryptMessage method required by the Decrypter interface.
   *
   * @param message The ciphertext to be decrypted.
   * @return  The deciphered message text.
   */
  public String decryptMessage(String message) {
    //  To be implemented in Activity #2
    return null;
  }

  /**
   * Helper method to create an Extended ASCII encoded string from a given
   * binary string.
   *
   * @param msgBitString The binary string to encode.
   *  Precondition: msgBitString is a binary string.
   * @return An string representing the binary string encoded in Extended
   *         ASCII.
   */
  private String binaryToString(String msgBitString) {
    //  To be implemented in Activity #2
    return null;
  }
}

/**
 * The RSAEncrypter class implements the public side of the RSA cryptosystem.
 * It implements the Encrypter interface.
 */
class RSAEncrypter implements Encrypter {
  private final long n, e;  // public-key information for the RSA cryptosystem

  /**
   * RSAEncrypter class constructor. Accepts the components of the public-key
   * for the cryptosystem.
   */
  public RSAEncrypter(long n, long e) {
    //  To be implemented in Activity #2
    this.n = 0; this.e = 0;
  }

  /**
   * The encryptMessage method required by the Encrypter interface.
   *
   * @param message The message to be encrypted.
   * @return  The ciphertext after applying the RSA encryption
   *          technique described in Activity #2.
   */
  public String encryptMessage(String message) {
    //  To be implemented in Activity #2
    return null;
  }

  /**
   * Helper method to create a binary string out of a given string of
   * characters.
   *
   * @param msgString The message to convert to a binary string.
   *  Precondition: msgString is encoded in Extended ASCII
   * @return  A binary string representing the message string.
   */
  private String stringToBinary(String msgString) {
    //  To be implemented in Activity #2
    return null;
  }
}

/**
 * RSAHelper class. Declared final with a private constructor so that it cannot
 * be subclassed or instantiated. This is a common technique for creating
 * classes whose sole purpose is the access to static methods. These two methods
 * in particular will aid in the development of the RSAEncrypter and
 * RSADecrypter classes.
 */
final class RSAHelper {
  /**
   * RSAHelper class constructor. Declared private so that objects cannot
   * be instantiated.
   */
  private RSAHelper() { }

  /**
   * Calculates the value, d, such that ed == 1 mod m using Euclid's Extended
   * Algorithm.
   *
   * @param e The value for which an inverse is requested.
   *  Precondition: e < m
   * @param m The modulus for finding the inverse.
   * @return  The value, d, such that ed == 1 mod m.
   */
  public static long calcModInverse(long e, long m) {
    long modulus = m, x = 0, y = 1;
    long buffer, quotient;

    if (m == 1)
      return 0;

    while (e > 1) {
      quotient = e / m;
      buffer = m;
      m = e % m;
      e = buffer;
      buffer =  x;
      x = y - quotient * x;
      y = buffer;
    }
    if (y < 0)
      y += modulus;
    return y;
  }

  /**
   * Performs modular exponentiation.
   *
   * @param base The base for modular exponentiation.
   * @param exponent The exponent for modular exponentiation.
   * @param m The modulus for modular exponentiation.
   * @return The result of base^exponent mod m.
   */
  public static long modExp(long base, long exponent, long m) {
    if (exponent == 0)
      return 1;
    long temp = modExp(base, exponent / 2, m);
    temp = (temp * temp) % m;
    if (exponent % 2 == 0)
      return temp;
    return base * temp;
  }
}
