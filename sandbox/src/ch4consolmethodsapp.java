import java.util.Scanner;

public class ch4consolmethodsapp {

	public static void main(String[] args) {

		System.out.println("welcome to the consolemethodsapp");
		Scanner sc = new Scanner(System.in);
		
		int a = promptforint("enter # a: ", sc);
		int b = promptforint("enter # b: ", sc);
		int c = promptforint("enter # c: ", sc);

		System.out.println("#s entered: " + a + ", " + b + ", " + c);
		System.out.println("bye");
		sc.close();

	}

	private static int promptforint(String prompt, Scanner s) {
		
		System.out.print(prompt);
		int n = s.nextInt();
		return n;		
	}
}
