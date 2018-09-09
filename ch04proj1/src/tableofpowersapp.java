import java.util.Scanner;

public class tableofpowersapp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Squares and Cubes Table");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {	
			System.out.println();
			System.out.print("Enter an integer: ");
			int number = sc.nextInt();
			System.out.println();
			String table = ("Number \t" + "Squared\t" + "Cubed  \n" +
					"======\t" + "=======\t" + "=====\n");
			System.out.println(table);
			for (int i = 1; i <= number; i++) {
				int squared = (i * i);
				int cubed = (i * i * i);
				String results = (i + "\t" + squared + "\t" + cubed);
				System.out.println(results);
			}
			System.out.println();
			System.out.print("Continue: y/n  ");
			choice = sc.next();
		}
		
		sc.close();
		System.out.println("bye");
	}

}
