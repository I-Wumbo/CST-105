package introduction;

import java.util.Scanner;

public class Tests {
	private static Scanner input;

	public static void main(String[] args) {
		double[] areas = new double[10];
		double[] radii = new double[10];

		input = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Please Enter in a radius:");
			radii[i] = input.nextDouble();
			areas[i] = Math.pow(radii[i], 2) * Math.PI;
		}

		for (double area : areas) {
			System.out.println("Area is: " + area);
		}
		/**
		 * System.out.println("Please enter in the radius:"); radius =
		 * input.nextDouble(); area = Math.pow(radius, 2) * Math.PI;
		 * 
		 * System.out.println("Area is:" + area);
		 */
	}

}
