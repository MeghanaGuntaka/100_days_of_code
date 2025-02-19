package day_44;

import java.util.*;

public class HappyString {

	public static void main(String[] args) {
		System.out.println(getHappyString(1, 3)); // Output: "c"
		System.out.println(getHappyString(1, 4)); // Output: ""
		System.out.println(getHappyString(3, 9)); // Output: "cab"
	}

	public static String getHappyString(int n, int k) {
		List<String> happyStrings = new ArrayList<>();
		backtrack(n, new StringBuilder(), happyStrings);

		return k <= happyStrings.size() ? happyStrings.get(k - 1) : "";
	}

	private static void backtrack(int n, StringBuilder sb, List<String> happyStrings) {
		if (sb.length() == n) {
			happyStrings.add(sb.toString());
			return;
		}

		for (char ch : new char[]{'a', 'b', 'c'}) {
			if (sb.length() == 0 || sb.charAt(sb.length() - 1) != ch) {
				sb.append(ch);
				backtrack(n, sb, happyStrings);
				sb.deleteCharAt(sb.length() - 1);
			}
		}

	}

}
