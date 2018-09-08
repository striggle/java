import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class tempuratureconverterapp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Tempurature Converter");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter degrees in Fahrenheit: ");
			double fahrenheit = sc.nextDouble();
			double celcius = (fahrenheit - 32) * 5/9;
			BigDecimal celcius1 = new BigDecimal(celcius)
					.setScale(2, RoundingMode.HALF_UP);
			System.out.println("Degrees in Celcius: " + celcius1);
			System.out.println();
			System.out.print("Continue? (y/n)");
			choice = sc.next();
		}
		
		sc.close();
		System.out.println("Bye");
	}

}
