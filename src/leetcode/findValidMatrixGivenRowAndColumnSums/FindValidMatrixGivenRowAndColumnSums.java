package leetcode.findValidMatrixGivenRowAndColumnSums;

public class FindValidMatrixGivenRowAndColumnSums {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length;
        int n = colSum.length;
        int[][] matrix = new int[m][n];  // Boş matris yaradırıq

        int i = 0, j = 0;  // Sətir və sütun göstəriciləri

        while (i < m && j < n) {
            // Minimum dəyəri tapırıq
            int val = Math.min(rowSum[i], colSum[j]);

            matrix[i][j] = val;  // Minimumu matrise yerləşdiririk

            // Minimum dəyəri sətir və sütun cəmlərindən çıxırıq
            rowSum[i] -= val;
            colSum[j] -= val;

            // Sətir və sütun tələbini yoxlayırıq
            if (rowSum[i] == 0) i++;  // cəm sıfırlanıbsa, növbəti sətrə keçirik
            if (colSum[j] == 0) j++;  // cəm sıfırlanıbsa, növbəti sütuna keçirik
        }

        return matrix;
    }
}
