class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int negCount = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    negCount++;
                } 
                min = Math.min(min, Math.abs(matrix[i][j]));
                sum = sum + Math.abs(matrix[i][j]);
            }
        }
        if (negCount % 2 != 0) {
            sum = sum - 2 * min;
        }

        return sum;
    }
}