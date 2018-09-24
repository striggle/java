

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        String[] nameParts = name.split(" ");
        String firstName = nameParts[0];
        String middleName = nameParts[1];
        String lastName = nameParts[2];
        
        System.out.println(firstName + "\n" + middleName + "\n" + lastName);
        
    }
}
