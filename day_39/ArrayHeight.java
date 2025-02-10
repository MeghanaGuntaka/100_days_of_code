package day_39;

import java.util.*;

public class ArrayHeight {
	public int heightChecker(int[] heights) {
		int[] expected = Arrays.copyOf(heights, heights.length);
		Arrays.sort(expected);

		int count = 0;
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != expected[i]) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		ArrayHeight obj = new ArrayHeight();
		int[] heights1 = {1, 1, 4, 2, 1, 3};
		System.out.println(obj.heightChecker(heights1)); 
		int[] heights2 = {5, 1, 2, 3, 4};
		System.out.println(obj.heightChecker(heights2));

	}

}
