package day_2;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
//		int n=125;
		int sum=0,r,t;
		t=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(t==sum)
		System.out.println("Armstrong");
		else
		System.out.println("Not Armstrong");

	}


}
