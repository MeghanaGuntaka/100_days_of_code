package day_42;

public class ReverseString {
	public void reverseString(char[] s) {
		int left = 0, right = s.length - 1;
		while (left < right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
		}
	}

	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		char[] s = {'h', 'e', 'l', 'l', 'o'};

		System.out.println("Original String: " + new String(s));
		obj.reverseString(s);
		System.out.println("Reversed String: " + new String(s));

	}

}
