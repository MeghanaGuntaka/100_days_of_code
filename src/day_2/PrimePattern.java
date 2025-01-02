package day_2;

public class PrimePattern {
	public static void main(String[] args) {
		 int n = 4; 
		 int primeCount = 1; 
		 int num = 2; 
		 for(int i = 1; i <= n; i++) 
		 {
			 for (int j = 1; j <= i; j++)
			 {
				 while (!isPrime(num))
				 {
					 num++;
				 }
				 System.out.print(num +" ");
				 primeCount++;
				 num++;
			 }
			 System.out.println();
		 	}
		 }
		 public static boolean isPrime(int num) 
		 {
			 if (num <= 1)
				 return false;
			 for (int i = 2; i <= Math.sqrt(num); i++) 
			 {
				 if (num % i == 0) {
					 return false;
				 }
			 }
		 return true;
	}

}
