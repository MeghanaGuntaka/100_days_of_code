package day_31;

public class ArraysSort {
	public boolean check(int[] nums) {
        int countBreaks = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                countBreaks++;
            }
        }
        
        return countBreaks <= 1;

    }

}
