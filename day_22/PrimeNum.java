package day_22;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),i;
		int flag=0;
		for(i=2;i*i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println(n+" is not a prime number");
		}
		else
		{
			System.out.println(n+" is a prime number");
		}
	}

}
