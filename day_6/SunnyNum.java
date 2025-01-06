package day_6;

public class SunnyNum {
	public static void main(String[] a)
	{
		int n=80,s=n+1;
		int flag=0;
		for(int i=1;i*i<=s;i++)
		{
			if(i*i==s)
			System.out.println(n + " is a sunny number");
			flag=0;
		}
		if(flag==1)
		System.out.println(n + " not is a sunny number");
	}

}
