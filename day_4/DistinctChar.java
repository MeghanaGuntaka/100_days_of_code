package day_4;

public class DistinctChar {
	public static void main(String[] args) 
	{
		int count=0;
		String s="googlego";
		char[] chars = s.toCharArray();
		for(int i = 0; i <= s.length()-1;i++) 
		{
			boolean isDistinct = true;
			for(int j = 0; j < i; j++) {
				if(chars[i] == chars[j]) {
					isDistinct = false;
					}
				}
				if(isDistinct) 
				{ 
					System.out.print(chars[i]+" ");
				}
		}

	}

}
