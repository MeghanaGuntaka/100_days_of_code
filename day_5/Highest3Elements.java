package day_5;

public class Highest3Elements {
	public static void main(String[] args) {
		int []a= {7,2 ,4 ,9, 1, 6, 3};
		//int temp=0;
		int max=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[i]) {
					max=a[i];
					a[i]=a[j];
					a[j]=max;
				}
			}
			
//			System.out.println(a[i]);		
		}
		for(int i=0;i<3;i++) {
			System.out.println(a[i]);
		}

	}

}
