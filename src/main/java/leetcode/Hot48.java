package leetcode;

public class Hot48 {
    public static void main(String[] args) {

    }

    /**
     * 使用辅助数组，找规律确定旋转后的位置
     */
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int[][] matrix_assist = new int[rows][rows];

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < rows; ++j) {
                matrix_assist[j][rows - i - 1] = matrix[i][j];
            }
        }

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < rows; ++j) {
                matrix[i][j] = matrix_assist[i][j];
            }
        }

    }


    /**
     * 尝试不使用辅助数组空间思路，翻转代替旋转
     */
    public void rotate1(int[][] matrix) {
        int rows = matrix.length;
        /**
         * 首先进行水平翻转
         * */
        for (int i = 0; i < rows / 2; ++i) {
            for (int j = 0; j < rows; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[rows - i - 1][j];
                matrix[rows - i - 1][j] = temp;
            }
        }

        /**
         * 而后按照主对角线再进行翻转
         * */
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < i; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
