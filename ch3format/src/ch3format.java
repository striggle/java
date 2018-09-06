import java.text.NumberFormat;

public class ch3format {

	public static void main(String[] args) {
		double price = 11.5751;
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("Formatted price = " + cf.format(price));
		
		double majority = .505;
		NumberFormat pf = NumberFormat.getPercentInstance();
		System.out.println("formatted percent = " + pf.format(majority));
		
		
	}

}
