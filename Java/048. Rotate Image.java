class Solution {
    public void rotate(int[][] matrix) {

		int n = matrix.length;
        
        for(int i=0 ; i< n;i++)
        {
            for(int j=0 ; j< n-i;j++)
            {
                int temp = matrix[i][j];
				matrix[i][j] = matrix[n - 1 - j][n - 1 - i];
				matrix[n - 1 - j][n - 1 - i] = temp;

            }
        }
        
        for (int i = 0; i < n / 2; i++)
			for (int j = 0; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n - 1 - i][j];
				matrix[n - 1 - i][j] = temp;
			}


    }
}