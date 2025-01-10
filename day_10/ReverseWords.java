package day_10;

public class ReverseWords {
	public static void main(String[] args) {
		String originalStr = "100 Days Challenge";
		String words[] = originalStr.split("\\s");
		String reversedString = "";

		for (int i = 0; i < words.length; i++) { 
            if (i == words.length - 1) 
            	reversedString = words[i] + reversedString; 
            else
            	reversedString = " " + words[i] + reversedString; 
        } 
		System.out.print("Reversed string : " + reversedString);
	}

}
