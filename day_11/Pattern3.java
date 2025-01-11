package day_11;

public class Pattern3 {
	public static void main(String[] a)
	{
		int n = 7;
		for(int i=n;i>=1;i--)
		{
			for(int j = i;j>n;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
