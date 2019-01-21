/**
 * Author: Karl Albornoz. This work is my own.
 */
package week5Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) throws FileNotFoundException {
		String pigLatin;
		final Character[] VOWELS = { 'A', 'E', 'I', 'O', 'U' };
		Scanner reader = new Scanner(new File("src/week5Exercises/Resources/text"));
		while (reader.hasNext()) {
			String word = reader.next().toUpperCase();
			for (int i = 0; i < word.length(); i++) {
				if (Arrays.asList(VOWELS).contains(new Character(word.charAt(i)))) {
					pigLatin = word.substring(i) + word.substring(0, i) + "AY";
					System.out.println(pigLatin);
					break;
				}
			}
		}
		reader.close();
	}
}
