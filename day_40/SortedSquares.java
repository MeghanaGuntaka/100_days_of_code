package day_40;

import java.util.*;

public class SortedSquares {
	    public int[] sortedSquares(int[] nums) {
	        int n = nums.length;
	        int[] result = new int[n];
	        int l = 0, r = n - 1; 
	        int index = n - 1; 
	        while (l <= r) {
	            int leftSquare = nums[l] * nums[l];
	            int rightSquare = nums[r] * nums[r];

	            if (leftSquare > rightSquare) {
	                result[index] = leftSquare;
	                l++; 
	            } else {
	                result[index] = rightSquare;
	                r--; 
	            }
	            index--; 
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	    	SortedSquares obj = new SortedSquares();
	        int[] nums1 = {-4, -1, 0, 3, 10};
	        System.out.println(Arrays.toString(obj.sortedSquares(nums1))); // Output: [0,1,9,16,100]

	        int[] nums2 = {-7, -3, 2, 3, 11};
	        System.out.println(Arrays.toString(obj.sortedSquares(nums2))); // Output: [4,9,9,49,121]
	}

}
