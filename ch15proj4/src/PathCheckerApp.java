import java.nio.file.Files;
import java.nio.file.Path;

public class PathCheckerApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Path Checker App!");
		System.out.println();
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			Path p = PathConsole.getPath("Enter a Path: ");
			System.out.println();
			if (Files.isRegularFile(p)) {
				System.out.println("That path points to a file");
			} else if (Files.isDirectory(p)) {
				System.out.println("That path points to a directory");
			} else {
				System.out.println("That path does not exist");
			}
			System.out.println();
			choice = PathConsole.getString("Continue? (y/n): ", "y", "n");
			System.out.println();
		}
		System.out.println("Thank you. Bye!");
	}

}
