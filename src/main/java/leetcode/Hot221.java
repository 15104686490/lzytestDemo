package leetcode;

public class Hot221 {
    public static void main(String[] args) {

    }

    /**
     * 普通方法
     */
    public int maximalSquare(char[][] matrix) {
        int maxSize = 0;
        if (matrix == null || matrix.length == 0 ||
                matrix[0].length == 0) {
            return maxSize;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == '1') {
                    maxSize = Math.max(maxSize, 1);
                    int currentMaxSize = Math.min(rows - i, columns - j);
                    for (int k = 1; k < currentMaxSize; k++) {
                        boolean flag = true;
                        if (matrix[i + k][j + k] == '0') {
                            break;
                        }
                        for (int m = 0; m < k; m++) {
                            if (matrix[i + k][j + m] == '0' ||
                                    matrix[i + m][j + k] == '0') {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            maxSize = Math.max(maxSize, k + 1);
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        int maxSquare = maxSize * maxSize;
        return maxSquare;
    }

    /**
     * 动态规划方法
     */
    public int maximalSquare1(char[][] matrix) {
        int maxSide = 0;
        if (matrix == null || matrix.length == 0 ||
                matrix[0].length == 0) {
            return maxSide;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] dp = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == '1') {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]),
                                dp[i - 1][j - 1]) + 1;
                    }
                    maxSide = Math.max(maxSide, dp[i][j]);
                }
            }
        }
        int maxSquare = maxSide * maxSide;
        return maxSquare;
    }
}
