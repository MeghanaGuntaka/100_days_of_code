package day_35;

import java.util.HashMap;

public class TupleProductPairs {
    public static int countTuples(int[] nums) {
        HashMap<Integer, Integer> productCount = new HashMap<>();
        int n = nums.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }
        for (int count : productCount.values()) {
            if (count > 1) {
                result += count * (count - 1) * 4; 
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 4, 6};
        System.out.println(countTuples(nums1)); // Output: 8

        int[] nums2 = {1, 2, 4, 5, 10};
        System.out.println(countTuples(nums2)); // Output: 16
    }
}
