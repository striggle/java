
public class UserIOTestApp {

	public static void main(String[] args) {

		ConsoleIO user = IOFactory.getUserIO();
		
		user.println("Welcome to the Console Tester App");
		user.println();
		
		intTest(user);
		
		doubleTest(user);
		
		requiredStringTest(user);
		
		stringChoiceTest(user);
		
		user.println("Test Successful, Goodbye!");
	}
	
	private static void intTest(ConsoleIO user) {
		user.println("Int Test");
		user.getInt("Enter an integer between -100 and 100: ", -101, 101);
		user.println();
	}
	private static void doubleTest(ConsoleIO user) {
		user.println("Double Test");
		user.getDouble("Enter any number between -100 and 100: ", -101, 101);
		user.println();
	}
	private static void requiredStringTest(ConsoleIO user) {
		user.println("Required String Test");
		user.getString("Enter your email address: ");
		user.println();
	}
	private static void stringChoiceTest(ConsoleIO user) {
		user.println("String Choice Test");
		user.getString("Select one (x/y): ", "x", "y");
		user.println();
	}

}
