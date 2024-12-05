package array;

import java.util.Scanner;

public class RomanNumberToInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a Roman numeral: ");
		String roman = scanner.nextLine();

		int result = romanToInt(roman);

		System.out.println("The integer value of Roman numeral " + roman + " is: " + result);

		scanner.close();
	}

	public static int romanToInt(String s) {
		char[] romanChars = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		int[] values = { 1, 5, 10, 50, 100, 500, 1000 };

		int result = 0;
		int prevValue = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			char currentChar = s.charAt(i);

			int currentValue = 0;
			for (int j = 0; j < romanChars.length; j++) {
				if (currentChar == romanChars[j]) {
					currentValue = values[j];
					break;
				}
			}

			if (currentValue < prevValue) {
				result -= currentValue;
			} else {
				result += currentValue;
			}

			prevValue = currentValue;
		}

		return result;
	}

}
