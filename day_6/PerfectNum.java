package day_6;

public class PerfectNum {
	public static void main(String[] args)
	{
		int num=6,sum=0;
        	for (int i = 1; i <= num/2; i++)
		{
			if (num%i == 0)
			sum += i;
		}
		if (sum == num)
		System.out.println(num+ " is a perfect number.");
     		else 
		System.out.println(num+ " is not a perfect number.");
	}


}
