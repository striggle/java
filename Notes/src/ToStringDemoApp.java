
public class ToStringDemoApp {

	public static void main(String[] args) {

		System.out.println("Welcome to  tostring demo app");
		
		Toy t1 = new Toy(0, "stuffy", 10);
		System.out.println("t1: " + t1);
		System.out.println("t1 toString(): " + t1.toString());
		
		System.out.println("t1 fields: " + t1.getId()+ ", " + t1.getCode());
		
		BoardGame bg1 = new BoardGame(1, "cl", 15, "CandyLand", 48);
		
		System.out.println(bg1);
		
		System.out.println("bye!");
	}

}
