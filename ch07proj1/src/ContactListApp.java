
public class ContactListApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Contact List Application");
		System.out.println();
		
		String firstName = ContactConsole.getString("Enter First Name:  ");
		String lastName = ContactConsole.getString("Enter Last Name:  ");
		String email = ContactConsole.getString("Enter Email:  ");
		String phoneNumber = ContactConsole.getString("Enter Phone Number:  ");
		System.out.println();
		Contact contact1 = new Contact(firstName, lastName, email, phoneNumber);
		

		
	}

}
