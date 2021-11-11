package leetcode;

public class offer2 {
    public static void main(String[] args) {

    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix[0].length == 0 || matrix.length == 0) return false;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int row = 0;
        int column = columns - 1;
        while (row < rows && column < columns) {
            int cur = matrix[row][column];
            if (cur == target) {
                return true;
            } else if (cur > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;

    }
}
