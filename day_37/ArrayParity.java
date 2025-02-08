package day_37;

public class ArrayParity {
	public void moveZeroes(int[] nums) {
		int dst = 0;  
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[dst++] = nums[i];
			}
		}

		while (dst < nums.length) {
			nums[dst++] = 0;
		}
	}

	public static void main(String[] args) {
		ArrayParity obj = new ArrayParity();
		int[] nums1 = {0, 1, 0, 3, 12};
		obj.moveZeroes(nums1);
		System.out.print("Example 1: ");
		printArray(nums1); // Output: 1 3 12 0 0
		int[] nums2 = {0};
		obj.moveZeroes(nums2);
		System.out.print("Example 2: ");
		printArray(nums2); // Output: 0
		int[] nums3 = {1, 0, 1};
		obj.moveZeroes(nums3);
		System.out.print("Example 3: ");
		printArray(nums3);  // Output: 1 1 0


	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


}
