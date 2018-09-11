import java.util.Scanner;

public class TempApp {

	public static void main(String[] args) {
		System.out.println("hello world!!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter price:  ");
		double price = sc.nextDouble();
		System.out.println("this is your #:  " + price);
		System.out.println("bye!");
		
		sc.close();
	}
	

}
