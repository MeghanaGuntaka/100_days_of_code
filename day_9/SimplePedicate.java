package day_9;

interface NumberPredicate {
	void check(int a);

}
public class SimplePedicate {
	public static void main(String[] args) {
		NumberPredicate pos =(int a)->{
			if(a>0 && a%2==0)
				System.out.println("The given number is positive and even");
			else if(a<0)
				System.out.println("The given number is Negative");
			else 
				System.out.println("The given number is Odd");
			
		};
		
		pos.check(7);
		
		// TODO Auto-generated method stub

	}

	

}
