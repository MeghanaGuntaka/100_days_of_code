package day_12;

public class Pattern8 {
	public static void main(String[] a)
	{
		int n=3;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==2 && j==2)
				System.out.print("0 ");
				else
				System.out.print("1 ");
			}
		System.out.println();
		}
	}

}
