package day_38;

import java.util.*;

public class ArrayExist {

	public boolean checkIfExist(int[] arr) {
		Set<Integer> set = new HashSet<>();

		for (int num : arr) {
			if (set.contains(2 * num) || (num % 2 == 0 && set.contains(num / 2))) {
				return true;
			}
			set.add(num); 
		}

		return false;
	}

	public static void main(String[] args) {
		ArrayExist obj = new ArrayExist();
		int[] arr1 = {10, 2, 5, 3};
		System.out.println(obj.checkIfExist(arr1)); 
		int[] arr2 = {3, 1, 7, 11};
		System.out.println(obj.checkIfExist(arr2)); 
		int[] arr3 = {0, 0};
		System.out.println(obj.checkIfExist(arr3)); 

	}

}
