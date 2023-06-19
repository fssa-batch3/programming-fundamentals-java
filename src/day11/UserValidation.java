package day11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

	public boolean isNameValid(String nameInput) throws IllegalArgumentException {
		try {

			if (nameInput == null || nameInput.isBlank()) {
				throw new IllegalArgumentException("name cannot be Null or Empty");
			}

			String regexPattern = "^[a-zA-Z]{3,25}$";
			Pattern ptn = Pattern.compile(regexPattern);
			Matcher matcher = ptn.matcher(nameInput);

			if (matcher.matches() == false) {
				throw new IllegalArgumentException("name doesnot match the expected pattern");
			}

			return true;
		} catch (RuntimeException e) {
			return false;
		}

	}

	public boolean isEmailValid(String eamilInput) throws IllegalArgumentException {

		try {

			if (eamilInput == null || eamilInput.isBlank()) {
				throw new IllegalArgumentException("name cannot be Null or Empty");
			}

			String eamilPattern = "^.*@.*\\..*$";
			Pattern ptn = Pattern.compile(eamilPattern);
			Matcher matcher = ptn.matcher(eamilInput);

			if (matcher.matches() == false) {
				throw new IllegalArgumentException("Email doesnot match the expected Pattern");
			}

			return true;

		} catch (RuntimeException e) {
			return false;
		}

	}

	public boolean isPhoneNumberValid(long phoneNumberInput) throws IllegalArgumentException {
		try {

			if (phoneNumberInput < 6000000000l) {
				throw new IllegalArgumentException("Invalid Phone Number");
			}

			if (phoneNumberInput > 9999999999l) {
				throw new IllegalArgumentException("Invalid Phone Number");
			}

			return true;

		} catch (RuntimeException e) {
			return false;
		}
	}

}
