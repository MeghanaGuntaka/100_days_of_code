package day_23;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // Pointer to the last element in the valid part of nums1
        int p2 = n - 1; // Pointer to the last element in nums2
        int p = m + n - 1; // Pointer to the last position in nums1
        
        // Iterate backwards through nums1 and nums2 and fill nums1 from the back
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1]; // Copy from nums1
                p1--;
            } else {
                nums1[p] = nums2[p2]; // Copy from nums2
                p2--;
            }
            p--; // Move the pointer for the merged array
        }
        
        // If there are still elements left in nums2, copy them over to nums1
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

}
