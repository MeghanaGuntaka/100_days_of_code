package day_46;

public class Anagram {

	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) return false;
		int[] freq=new int[26];
		for(char c:s.toCharArray()){
			freq[c-'a']++;
		}
		for(char c:t.toCharArray()){
			if(freq[c-'a']-- <= 0)return false;
		}
		return true;
	}
	public static void main(String[] a) {
		Anagram obj = new Anagram();
		System.out.println(obj.isAnagram("anagram", "nagaram")); // true
		System.out.println(obj.isAnagram("rat", "car"));         // false
	}

}
