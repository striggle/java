import java.util.Scanner;

public class IOFactory {
	
	public static ConsoleIO getUserIO() {
		Scanner sc = new Scanner(System.in);
		ConsoleIO userIO = new ConsoleIO(sc);
		return userIO;
	}

}
