
public class NumberCheckerApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Odd/Even Checker");
		System.out.println();
		MyConsole console1 = new MyConsole();
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int a = console1.getInt("Enter an Integer: ");
			String s = NumberChecker.CheckOddEven(a);
			System.out.println(s);	
			System.out.println();
			choice = console1.getString("Continue (y/n): ");
		}
		
		
		System.out.println("bye");
	}

}
