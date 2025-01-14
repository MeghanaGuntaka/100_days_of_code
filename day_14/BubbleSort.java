package day_14;

public class BubbleSort {
	public static void sortdown(int[]a)
	{
		int n=a.length;
		for (int i=0;i<n-1 ;i++ )
		{
			for (int j=i+1;j<n ;j++ )
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	

}
