package day_3;

public class UniqueElements {
	public static void main(String[] args) {
		int arr[]= {3,6,1,1,5,9,9,3,7};
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
//					System.out.print(arr[i]+" ");
					count++;
				}
			}
			if(count==1)
				System.out.print(arr[i]+" ");
				
		}
		// TODO Auto-generated method stub

	}

}
