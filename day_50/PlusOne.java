package day_50;

import java.util.Arrays;

public class PlusOne {
	public int[] plus(int[] digits) {
		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] arr = new int[n + 1];
		arr[0] = 1; 
		return arr;
	}
	public static void main(String[] args) {
		PlusOne obj = new PlusOne();

		int[] digits = {9, 9, 9}; 
		int[] result = obj.plus(digits);

		System.out.println("Result: " + Arrays.toString(result));
	}

}
