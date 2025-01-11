package day_11;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] a)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = n;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
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
