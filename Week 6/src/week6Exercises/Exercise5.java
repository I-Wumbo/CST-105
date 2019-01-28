/**
 * Author: Karl Albornoz
 * This work is my own. For the text file I just copied and pasted
 * random text from our text book.
 */
package week6Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner reader = new Scanner(new File("src/week6Exercises/Resources/text"));
		char[][] letters = new char[20][45];
		int rows = letters.length;
		int columns = letters[1].length;
		int count = 0;
		StringBuilder sb = new StringBuilder();
		String line = reader.nextLine();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (count < line.length()) {
					letters[i][j] = line.charAt(count);
					count++;
				} else if (letters[i][j] == 0) {
					letters[i][j] = '@';
				}

			}
		}

		for (int j = 0; j < columns; j++) {
			for (int i = 0; i < rows; i++) {
				sb.append(letters[i][j]);
			}
		}

		System.out.println(sb);
		reader.close();
	}

}
