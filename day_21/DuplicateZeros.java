package day_21;

public class DuplicateZeros {
	 public void duplicateZeros(int[] arr) {
	        int zeros = 0;
	        int length = arr.length;
	        for (int i = 0; i < length; i++) 
	            if (arr[i] == 0) {
	                zeros++;
	        }

	        for (int i = length - 1, j = length + zeros - 1; i >= 0; i--, j--) {
	            if (j < length) 
	                arr[j] = arr[i];
	            if (arr[i] == 0) {
	                j--; 
	                if (j < length) 
	                    arr[j] = 0;
	            }
	        }
	        
	    }

}
