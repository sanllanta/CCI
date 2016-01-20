//O(n), in place
rotateLeft(int[][] matrix){
	for(int i = 0; i < n/2; i++){
		for(int j = 0; j < n/2; j++){
			int a = matrix[i][j];
			int b = matrix[n-1][j];
			int c = [n-i][n-j];
			int d = [i][n-j]

			matrix[i][j] = d
			matrix[n-1][j] = a
			matrix[n-i][n-j] = b
			matrix[i][n-j] = c
		}
	}
}
