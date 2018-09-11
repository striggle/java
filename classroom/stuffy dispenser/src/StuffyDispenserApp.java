import java.util.Scanner;

public class StuffyDispenserApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Stuffy Dispenser!");
		
		System.out.println("Create a new Stuffy...");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter stuffy name:  ");
		String name = sc.next();
		
		System.out.println("Enter stuffy type (bear, monkey, dog, ect):  ");
		String type = sc.next();
		
		System.out.println("Enter stuffy color:  ");
		String color = sc.next();
		
		stuffy myStuffy = new stuffy(name, type, color);
		
		System.out.println("New stuffy: " + myStuffy);
		
		sc.close();
		System.out.println("Bye!");
	}

}
