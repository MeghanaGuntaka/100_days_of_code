package day_30;

public class RemoveChar {
	public static String removeStars(String s) {
		char[] result = new char[s.length()]; 
		int index = 0; 

		for (char c : s.toCharArray()) {
			if (c == '*') {
				if (index > 0) {
					index--;
				}
			} else {
				result[index] = c;
				index++;
			}
		}

		return new String(result, 0, index);
	}

	public static void main(String[] args) {
		System.out.println(removeStars("leet**cod*e"));  // Output: "lecoe"
		System.out.println(removeStars("erase*****"));   // Output: ""
	}
}


