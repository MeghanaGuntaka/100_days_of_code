package day_11;

public class Pattern1 {
	public static void main(String[] a)
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{	
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
