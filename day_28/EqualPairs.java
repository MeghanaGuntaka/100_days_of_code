package day_28;

public class EqualPairs {
	public int equalPairs(int[][] grid) {
		int n = grid.length;
		int count = 0;

		// Iterate through each row
		for (int i = 0; i < n; i++) {
			// Iterate through each column
			for (int j = 0; j < n; j++) {
				// Compare row i and column j
				if (isRowEqualToColumn(grid, i, j)) {
					count++;
				}
			}
		}

		return count;
	}

	// Helper method to check if row i is equal to column j
	private boolean isRowEqualToColumn(int[][] grid, int row, int col) {
		int n = grid.length;

		for (int k = 0; k < n; k++) {
			if (grid[row][k] != grid[k][col]) {
				return false; // If any element doesn't match, return false
			}
		}

		return true; // All elements match


	}

}
