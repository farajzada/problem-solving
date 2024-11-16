package leetcode.findValidMatrixGivenRowAndColumnSums;

public class FindValidMatrixGivenRowAndColumnSums {
    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length;
        int n = colSum.length;
        int[][] matrix = new int[m][n];

        int i = 0, j = 0;

        while (i < m && j < n) {

            int val = Math.min(rowSum[i], colSum[j]);

            matrix[i][j] = val;


            rowSum[i] -= val;
            colSum[j] -= val;


            if (rowSum[i] == 0) i++;
            if (colSum[j] == 0) j++;
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] rowSum = {6, 12};
        int[] colSum = {8, 9};
        int[][] result = restoreMatrix(rowSum, colSum);
        System.out.println("cavab budur:");
        printMatrix(result);
    }
}
