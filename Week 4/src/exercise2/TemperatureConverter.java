package exercise2;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double fahrenheit;
		double celsius;

		System.out.println("Enter a Fahrenheit Temperature: ");
		fahrenheit = input.nextDouble();
		System.out.printf("%.0fF is equivalent to %fC%n", fahrenheit, (fahrenheit - 32) * (5.0 / 9.0));
		System.out.println();

		System.out.println("Enter a Celsius Temperature: ");
		celsius = input.nextDouble();
		System.out.printf("%.0fC is equivalent to %.2fF", celsius, (celsius * (9.0 / 5.0) + 32));
		input.close();
	}
}
