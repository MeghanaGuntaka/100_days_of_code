package day_6;

public class Peterson {
	public static void main(String[] args)
	{
		int num=145,sum=0,var=num;
		int rem;
		while(num>0)
		{
			rem=num%10;
			int f=1;
			for(int i=1;i<=rem;i++)
			{
				f=f*i;
			}
			num=num/10;
			sum=sum+f;
			
		}
	if(sum==var)
	{
		System.out.println(var+" is a Peterson");
	}
	else
	System.out.println(var+" is not a Peterson");
	}

}
