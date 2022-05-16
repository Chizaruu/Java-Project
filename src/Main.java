import java.util.Scanner;

/**
 * 
 */

/**
 * @author Abdul Kadir Ibn Ali
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte b = 127;

		short s = 32767;
		int i = 2147483647;
		double d = 1.79769313486231;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number (Step 1): ");
		// Produce an integer by dividing your byte by a number input in the terminal
		// Test Text
		System.out.println("Integer: " + ((Object) (b / sc.nextInt())).getClass().getName());
		// Produce a long by multiplying your short by a number input in the terminal
		System.out.println("Enter a number (Step 2): ");
		System.out.println("Long: " + ((Object) (s * sc.nextLong())).getClass().getName());
		// Produce a double by dividing your integer by a number input in the terminal
		System.out.println("Enter a number (Step 3): ");
		// A suitable double is 1.79769313486231E308
		System.out.println("Double: " + ((Object) (i / sc.nextDouble())).getClass().getName());
		// Produce a char that is the first character in a string input in the terminal
		System.out.println("Enter a string (Step 4): ");
		System.out.println("Char: " + ((Object) (sc.next().charAt(0))).getClass().getName());
		sc.close();
	}
}
