/**
 * Author: Karl Albornoz. This work is my own.
 */
package week5Exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int answer = rand.nextInt(10000) + 1;
		int guessCount = 1;
		int min = 1;
		int max = 10000;
		int guess;

		System.out.print("Enter a guess between 1 and 10000:");
		guess = input.nextInt();

		while (guess != answer) {
			if (guess > answer || guess == max) {
				System.out.println("LOWER \n");
				guessCount++;

				max = (guess < max || guess == max) ? max = guess - 1 : max;

			} else if (guess < answer || guess == min) {
				System.out.println("HIGHER \n");
				guessCount++;

				min = (guess > min || guess == min) ? min = guess + 1 : min;
			}

			if (min == max) {
				break;
			}

			System.out.printf("Enter a guess between %d and %d:", min, max);
			guess = input.nextInt();
		}
		System.out.printf("You WIN. It took you %d guess(es)", guessCount);
		input.close();
	}
}
