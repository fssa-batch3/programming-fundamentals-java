package day07;

public class ConditionalStatementDemo2 {

	public static void main(String[] args) {

		// Step 1: Define input
		int mark = 90;

		// Step 2: Implement Business Logic
		String grade = "";

		if (mark >= 90 && mark <= 100) {
			grade = "A";
		} else if (mark >= 80 && mark < 90) {
			grade = "B";
		} else if (mark >= 50 && mark < 80) {
			grade = "C";

		} else {
			grade = "F";
		}

		// Step 3: Display Output
		System.out.println("Mark=" + mark + " , Grade = " + grade);

	}

}
