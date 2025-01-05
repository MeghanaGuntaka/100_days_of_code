package day_5;

public class MissingValue {
	public static void main(String[] args) {
		int arr[]={5,6,2,3,1};
		int sum=0;
		int n=(arr.length+1)*((arr.length+1)+1)/2;
//		System.out.println(arr.length+1);
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
//		System.out.println(sum);
		System.out.println(n-sum);
		
		// TODO Auto-generated method stub

	}
}
