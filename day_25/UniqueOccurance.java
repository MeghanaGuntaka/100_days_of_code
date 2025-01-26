package day_25;
import java.util.*;
public class UniqueOccurance {

	    public boolean uniqueOccurrences(int[] arr) {
	        Map<Integer, Integer> occurrenceMap = new HashMap<>();
	        for (int num : arr) {
	            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
	        }
	        Set<Integer> occurrenceSet = new HashSet<>();
	        for (int count : occurrenceMap.values()) {
	            if (!occurrenceSet.add(count)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	    	UniqueOccurance solution = new UniqueOccurance();
	        int[] arr1 = {1, 2, 2, 1, 1, 3};
	        System.out.println(solution.uniqueOccurrences(arr1)); // Output: true
	        int[] arr2 = {1, 2};
	        System.out.println(solution.uniqueOccurrences(arr2)); // Output: false
	        int[] arr3 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
	        System.out.println(solution.uniqueOccurrences(arr3)); // Output: true
	    }

}
