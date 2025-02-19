package day_45;

public class StringDiff {
	public char findTheDifference(String s, String t) {
		char result = 0;
		for (char ch : s.toCharArray()) {
			result ^= ch;
		}
		for (char ch : t.toCharArray()) {
			result ^= ch;
		}

		return result; 
	}

	public static void main(String[] args) {
		StringDiff obj= new StringDiff();
		System.out.println(obj.findTheDifference("abcd", "abcde")); // Output: 'e'
		System.out.println(obj.findTheDifference("", "y")); // Output: 'y'
	}

}
