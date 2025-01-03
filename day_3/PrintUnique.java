package day_3;

public class PrintUnique {
	public static void main(String[] args) {
		int n=0;
		int a[]=new int[6];
		int arr[]= {3,6,1,1,5,9,9,3,7};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]!=arr[j]) {
					a[n]=arr[i];
					n++;
					System.out.println(n);
//					System.out.println(a[n]);
				}
			}
//			System.out.println(a[n]);
			
		}
		System.out.println(n);
		// TODO Auto-generated method stub
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[n]);
//		}
	}

}
