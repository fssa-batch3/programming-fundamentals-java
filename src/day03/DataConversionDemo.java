package day03;

public class DataConversionDemo {

	public static void main(String[] args) {

		byte bytes = 123;
		System.out.println("\n length of byte datatypes is => " + bytes);

		short shrt = 32767;
		System.out.println("\n length of short datatypes is => " + shrt);

		int three = Integer.parseInt("3");
		System.out.println("\n three = " + three);

		float percentage = Float.parseFloat("98.3");
		System.out.println("\n percentage= " + percentage);

		double pi = Double.parseDouble("3.14");
		System.out.println("\n pi = " + pi);

		long number = Long.parseLong("9876543210");
		System.out.println("\n number = " + number);

		boolean bln = false;
		System.out.println("\n boolean can either have true or false");
		System.out.println(" value of btn is => " + bln);

		char initial = 'U';
		System.out.println("\n char datatype can store only single character");
		System.out.println(" Value of initial is => " + initial);

	}

}
