import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberCheckerApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the prime number checker");
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.println();
			int num = Console.getInt("Please enter an integer between 1 and 5000: ", 0, 5001);
			for(int i = 1; i <= Math.sqrt(num); i++) {
		        if(num % i == 0) {
		            list1.add(i);
		            if(i != num/i) {
		                list2.add(num/i);
		            }    
		        }
			}  
			int a = list1.size() + list2.size();
			if (a==2) {
				System.out.println(num + " is a prime number.");
			} else {
				System.out.println(num + " is not a prime number");
				System.out.print("It has " + a + " factors: ");
				for (int b : list1) {
					System.out.print(b + " ");
				}
				for (int c : list2) {
					System.out.print(c + " ");
				}
				System.out.println();
			}
			
			list1.clear();
			list2.clear();
			System.out.println();
			System.out.print("Continue? (y/n): ");
			choice = sc.next();		
		}
		sc.close();
		System.out.println("Goodbye!");
	}
	
	
}
