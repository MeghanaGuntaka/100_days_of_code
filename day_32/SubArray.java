package day_32;

public class SubArray {
	public int longestMonotonicSubarray(int[] nums) {
		if (nums.length == 1) return 1;

		int incLen = 1, decLen = 1, maxLen = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				incLen++;
				decLen = 1;  // Reset decreasing length
			} else if (nums[i] < nums[i - 1]) {
				decLen++;
				incLen = 1;  // Reset increasing length
			} else {
				incLen = 1;
				decLen = 1;
			}
			maxLen = Math.max(maxLen, Math.max(incLen, decLen));
		}

		return maxLen;
	}

	public static void main(String[] args) {
		SubArray sol = new SubArray();
		int[] nums1 = {1, 4, 3, 3, 2};
		System.out.println(sol.longestMonotonicSubarray(nums1)); // Output: 2

		int[] nums2 = {3, 3, 3, 3};
		System.out.println(sol.longestMonotonicSubarray(nums2)); // Output: 1

		int[] nums3 = {3, 2, 1};
		System.out.println(sol.longestMonotonicSubarray(nums3)); // Output: 3
	}
}


