import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PathConsole {
	
	private static Scanner sc = new Scanner(System.in);

    // Make every entry required
    public static String getString(String prompt) {
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

    public static String getString(String prompt, String v1, String v2) {
        boolean isValid = false;
        String s = "";
        while (!isValid) {
            s = getString(prompt);  // read user entry
	        if (s.equalsIgnoreCase(v1) || s.equalsIgnoreCase(v2)) {
	        	isValid = true;
	        }
	        else {
	        	System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
	        }
        }
        return s;
    }
    
    public static Path getPath(String prompt) {
    	String s = getString(prompt);
    	Path p = Paths.get(s);
    	return p;
    }

}
