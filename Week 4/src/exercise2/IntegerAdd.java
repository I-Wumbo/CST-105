/**
 * Author: Karl Albornoz. This work is my own.
 */
package exercise2;

import java.util.Scanner;

public class IntegerAdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter in 5-digit positive integer: ");
		int number = input.nextInt();
		input.close();

		int digit1 = number % 10;
		number /= 10;

		int digit2 = number % 10;
		number /= 10;

		int digit3 = number % 10;
		number /= 10;

		int digit4 = number % 10;
		number /= 10;

		int digit5 = number % 10;
		number /= 10;

		int sum = digit1 + digit2 + digit3 + digit4 + digit5;

		System.out.printf("The sum of %d + %d + %d + %d + %d is: %d", digit5, digit4, digit3, digit2, digit1, sum);

	}
}
