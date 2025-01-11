package day_11;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] a)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<n;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.println("*");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=n;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
