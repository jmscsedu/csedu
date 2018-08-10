/**
 * Calendar Lab (Template Class and Test Cases)
 * This is the template class and test cases for the Calendar Lab.
 * Written for the Woodstock School in Mussoorie, Uttarakhand, India.
 * 
 * @author Jeffrey Santos
 * @version 1.0
 */

public class Calendar {
	public static void main(String[] args) {
		//	Tests for calculateDayOfWeek:
		System.out.println(calculateDayOfWeek(9, 7, 1983));		// Output: 6
		System.out.println(calculateDayOfWeek(15, 4, 2016));	// Output: 5
		System.out.println(calculateDayOfWeek(30, 1, 2000));	// Output: 0

		//	Tests for getDayOfWeek:
		System.out.println(getDayOfWeek(9, 7, 1983));					// Output: "Saturday"
		System.out.println(getDayOfWeek(15, 4, 2016));				// Output: "Friday"
		System.out.println(getDayOfWeek(30, 1, 2000));				// Output: "Sunday"

		//	Tests for printCalendar:
		//	 Use the calendar feature of your computer to verify correct output.
		printCalendar(7, 1983);
		printCalendar(4, 2016);
		printCalendar(1, 2000);
	}

	/**
	 * Calculates the day of the week as a number between 0 and 6.
	 * (0=Sunday, 6=Saturday)
	 *
	 * @param day
	 *	Precondition: day is a valid day of the given month.
	 * @param month
	 *	Precondition:	month is a valid month of the year.
	 * @param year
	 *	Precondition: year is a valid year after the adoption of the Gregorian Calendar.
	 * @return	A number corresponding to the day of the week for the given date.
	 *				  (0=Sunday, 6=Saturday)
	 */
	public static int calculateDayOfWeek(int day, int month, int year) {
		//	To be implemented in Activity #1, Exercise 1
	}

	/**
	 * Returns the day of the week as a string.
	 *
	 * @param day
	 *	Precondition: day is a valid day of the given month.
	 * @param month
	 *	Precondition: month is a valid month of the year.
	 * @param year
	 *	Precondition: year is a valid year after the adoption of the Gregorian Calendar.
	 * @return	A string corresponding to the day of the week for the given date.
	 */
	public static String getDayOfWeek(int day, int month, int year) {
		//	To be implemented in Activity #1, Exercise 2
	}

	/**
	 * Determines whether or not a given year is a leap year.
	 *
	 * @param year
	 *	Precondition: year is a valid year after the adoption of the Gregorian Calendar.
	 * @return	true if the given year is a leap year, false otherwise.
	 */
	public static boolean isLeapYear(int year) {
		//	To be implemented in Activity #2, Exercise 1
	}

	/**
	 * Prints a visual calendar for the given month and year.
	 *
	 * @param month
	 *	Precondition: month is a valid month is the year.
	 * @param year
	 *	Precondition: year is a valid year after the adoption of the Gregorian calendar.
	 */
	public static void printCalendar(int month, int year) {
		//	To be implemented in Activity #2, Exercise 2
	}

	/**
	 * A fix to the Java built in modulus operator (%) to behave more
	 * like mathematical modulo.
	 * @param n
	 * @param m
	 * @return returns n mod m as expected mathematically
	 */
	 public static int mod(int n, int m) {
		 return (n % m + m) % m;
	 }
}

