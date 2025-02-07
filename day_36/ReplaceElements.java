package day_36;

public class ReplaceElements {
	public int[] replaceElements(int[] arr) {
		int n = arr.length;
		int maxSoFar = -1; 
		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[i]; 
			arr[i] = maxSoFar; 
			maxSoFar = Math.max(maxSoFar, temp); 
		}

		return arr;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ReplaceElements sol = new ReplaceElements();

		// Test Case 1
		int[] arr1 = {17, 18, 5, 4, 6, 1};
		System.out.print("Input: ");
		printArray(arr1);
		int[] result1 = sol.replaceElements(arr1);
		System.out.print("Output: ");
		printArray(result1);

		// Test Case 2
		int[] arr2 = {400};
		System.out.print("Input: ");
		printArray(arr2);
		int[] result2 = sol.replaceElements(arr2);
		System.out.print("Output: ");
		printArray(result2);
	}
}

