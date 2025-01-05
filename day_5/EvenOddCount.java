package day_5;

public class EvenOddCount {
	public static void main(String[] args) {
		int a1[]= {3,4,7,9,2,6,1};
		int even_count=0;
		int odd_count=0;
		for(int i=0;i<a1.length;i++) {
			if(a1[i]%2==0)
				even_count++;
			else
				odd_count++;
		}
		// TODO Auto-generated method stub
		System.out.println("Even Elements: "+even_count);
		System.out.println("Odd Elements: "+odd_count);
	}
}
