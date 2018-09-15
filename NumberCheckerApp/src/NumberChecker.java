
public class NumberChecker {

	public static String CheckOddEven(int a) {
		String s = "";
		if (a % 2 == 0) {
			s = ("The number " +a+ " is even");
		} else {
			s = ("The number " +a+ " is odd");
		}
		return s;
	}
	
}
