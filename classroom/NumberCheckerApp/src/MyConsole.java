import java.util.Scanner;

public class MyConsole extends NumberCheckerConsole {

	private Scanner sc = new Scanner(System.in);

    // Make every entry required
    public String getString(String prompt) {
    	boolean isValid = false;
    	String s = "";
    	while (!isValid) {
            System.out.print(prompt);
            s = sc.nextLine();  // read user entry
            if (s.equals("")) {
            	System.out.println("Error!  This entry is required!");
            }
            else {
            	isValid = true;
            }
    	}
        return s;
    }
	
}
