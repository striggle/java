import java.util.Scanner;

public class studentregistrationapp {

	public static void main(String[] args) {

		System.out.println("Student Registration Form");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Name: ");
		String first = sc.next();
		
		System.out.print("Enter Last Name: ");
		String last = sc.next();
		
		System.out.print("Enter Birth Year: ");
		String birth = sc.next();
		
		System.out.println();
		System.out.println("Welcome " + first + " " + last + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + first + "*" + birth);
		
		sc.close();
		System.out.println("Thank you, bye");
	}

}
