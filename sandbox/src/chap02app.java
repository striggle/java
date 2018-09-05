import java.util.Scanner;

public class chap02app {

	public static void main(String[] args) {
		
		System.out.println("hello");
		
		System.out.println("enter an integer:  ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		System.out.println("enter anouther integer:  ");
		double b = sc.nextInt();
		
		double avg = (a+b) / 2;
		
		System.out.println("average = "+avg);
		
		// if average is greater than 10 say woo-hoo, if not say boo
		if (avg > 10) {
			System.out.println("woo-hoo! greater than 10!!");
			System.out.println("avg is "+avg);
		}	
		else {
			System.out.println("boo! not greater than 10!");
			System.out.println("avg is "+avg);
		}
		
		//get a string from user and test if it equals 'yes'
		System.out.println("enter 'yes' or 'no'");
		String str = sc.next();
		if (str.equals("yes"))
			System.out.println("user entered 'yes'");
		System.out.println("bye");
		sc.close();
	}
	

}
