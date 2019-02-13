/**
 * Author: Karl Albornoz. This work is my own.
 * Note: I didn't realize until looking at the sample output provided
 * with the exercise that 1 was not prime. Because of this my flowchart shows
 * something different from the code.
 */
package week8Exercises;

public class PalindromePrime {

	public static void main(String[] args) {
		System.out.println("Palindromic Primes");
		System.out.println("------------------");
		for (int i = 1; i <= 100000; i++) {
			if (isPrime(i) && isPalindrome(i)) {
				System.out.println(i);
			}
		}
	}

	/**
	 * Tests to see if the number passed in is prime
	 * 
	 * @param number is the number passed in
	 * @return true if number is prime, false otherwise.
	 */
	public static boolean isPrime(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Tests to see if the number passed in is a palindrome
	 * 
	 * @param number the number passed in
	 * @return true if the number is a palindrome, false otherwise
	 */
	public static boolean isPalindrome(int number) {
		char[] numbers = String.valueOf(number).toCharArray();
		int digits = String.valueOf(number).length();

		switch (digits) {
		case 1:
			return true;
		case 2:
		case 3:
			if (numbers[0] == numbers[numbers.length - 1])
				return true;
			break;
		case 4:
		case 5:
			if (numbers[0] == numbers[numbers.length - 1] && numbers[1] == numbers[numbers.length - 2])
				return true;
			break;
		default:
			return false;
		}
		return false;
	}

}
