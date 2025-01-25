package day_24;

public class DuplicateArray {
	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) return 0;
		int k = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;

	}
	public static void main(String[] a) {
		int[] arr = {10,20,10,3,4,5,6,6};
		System.out.println(removeDuplicates(arr));
	}


}
