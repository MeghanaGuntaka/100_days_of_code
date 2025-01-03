package day_3;

public class SeggregateNumbers {
	public static void main(String[] args) {
		int a[]= {1,0,1,1,0,0,1,0,1,0};
		int count=0;
		int n=a.length;
//		int arr[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i]==0)
//				a[n]=0;
				count++;
		}
		for(int i=0;i<count;i++){
			a[i]=0;
		}
		for (int i = count; i < n; i++) {
            a[i] = 1;
    	}
		for (int i = 0; i < n; i++)
        System.out.print(a[i] + " ");
		
			
	}
}
