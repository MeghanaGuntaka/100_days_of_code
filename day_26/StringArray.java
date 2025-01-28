package day_26;

import java.util.*;

public class StringArray {

	public String[] removeDuplicates(String[] strings) {
		HashSet<String> set = new HashSet<>(Arrays.asList(strings));
		String[] uniqueStrings = set.toArray(new String[0]);
		return uniqueStrings;
	}

	public static void main(String[] args) {
		StringArray obj = new StringArray();
		String[] input = {"apple", "banana", "apple", "orange", "banana"};
		String[] result = obj.removeDuplicates(input);
		System.out.println(Arrays.toString(result));
	}



}
