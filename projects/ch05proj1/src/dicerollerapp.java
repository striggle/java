import java.util.Scanner;

public class dicerollerapp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Dice Roller");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Roll the dice? (y/n):  ");
		String choice = sc.next();
		System.out.println();
		int x = 0;
		int y = 0;
		while (choice.equalsIgnoreCase("y")) {
			diceRoller(x, y);
			System.out.println();
			System.out.print("Roll again?  (y/n):  ");
			choice = sc.next();
			System.out.println();
		}
		sc.close();
		System.out.println("Bye");
		
	}
	public static void diceRoller(int x, int y) {
		int limit = 6;
		double a = Math.random() * limit;
		x = (int) a;
		x++;
		double b = Math.random() * limit;
		y = (int) b;
		y++;
		int total = (x + y);
		System.out.println("Dice 1:  " + x);
		System.out.println("Dice 2:  " + y);
		System.out.println("total:  " + total);
		if (total == 2) {
			System.out.println("Snake Eyes!");
		}
		if (total == 12) {
			System.out.println("Boxcars!");
		}

	}
		
	
}


