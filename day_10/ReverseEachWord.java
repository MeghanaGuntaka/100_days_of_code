package day_10;

public class ReverseEachWord {
	public static void main(String[] args) {
	    String originalStr = "100 Days of code";
	    String words[] = originalStr.split("\\s");
	    String reversedString = "";
	    for (int i = 0; i < words.length; i++) 
	    {
	      String word = words[i];
	      String reverseWord = "";
	      for (int j = word.length() - 1; j >= 0; j--) {
	        reverseWord = reverseWord + word.charAt(j);
	      }
	      reversedString = reversedString + reverseWord + " ";
	    }
	 
	    System.out.print("Reversed string : " + reversedString);
	  }

}
