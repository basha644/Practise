package corestocky;

import java.util.Arrays;

public class Demo {
	static void validateAge(int age) throws Exception {
		try {
			int[] arr = new int[3];
			System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception caught.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception caught.");
		} catch (Exception e) {
			System.out.println("Some other exception caught.");
		}

		if (age < 18) {
			throw new Exception("Age must be 18 or above to vote.");
		}
		System.out.println("Valid age!");
	}
	public static void main(String[] args) {
		try {
			validateAge(17);
		} catch (Exception e) {
			System.out.println("Exception caught: " + e);
		}
	}


}





