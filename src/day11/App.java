package day11;

public class App {

	public static void main(String[] args) {

		String firstName = "Surya";
		String lastName = "Umapathy";
		long phoneNumber = 9999999999l;
		String email = "surya.umapathy@freshworks.com";
		String password = "superSecretPassCode$123";

		UserValidation userValidation = new UserValidation();

		System.out.println(userValidation.isNameValid(firstName));
		System.out.println(userValidation.isNameValid(lastName));
		System.out.println(userValidation.isEmailValid(email));
		System.out.println(userValidation.isPhoneNumberValid(phoneNumber));
		
		User user1 = new User();
		user1.setFirstName(firstName);
		user1.setLastName(lastName);
		user1.setEmail(email);
		user1.setPhoneNumber(phoneNumber);
		user1.setPassword(password);
		
		
		user1.toString();
	}
}
