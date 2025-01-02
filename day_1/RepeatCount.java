package day_1;

public class RepeatCount {

	public static void main(String[] args) {
		int a[]= {3,6,1, 2, 1, 8, 9, 1,2 ,2 ,4, 7, 2, 2};
		int num=0;
		int max=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;	
				}
				if(count>max) {
					max=count;
					num=a[i];
				}
						
			}
			
		}
			System.out.println(num+" is repeating for "+max+" times");
		// TODO Auto-generated method stub

	}

}
