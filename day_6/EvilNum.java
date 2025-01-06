package day_6;

public class EvilNum {
	public static void main(String[] a)
	{
		int n=13,count=0,temp=n;
		while(n>0)
		{
			if(n%2==1)
			count++;
			n=n/2;
		}
		if(count%2==0)
		System.out.println(temp+" is a Evil Number");
		else
		System.out.println(temp+" is a Odiouse  Number");
	}

}
