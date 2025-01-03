package day_3;

public class PrintDuplicates {
	public static void main(String[] args) {
//		int i=0;
//		int count=0;
		int a[] = {3,6,1,1,5,9,9,3,1,1,7,3};
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i+1;j<a.length;j++) {
		 		if(a[i]==a[j]) {
		 			count++;
//		 			System.out.println(count+" "+a[i]);
				}
			}
			if(count==1) {
				System.out.print(a[i]+" ");
			}
		}
		
		// TODO Auto-generated method stub

	}
}
