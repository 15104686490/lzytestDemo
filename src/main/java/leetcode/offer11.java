package leetcode;

public class offer11 {
    public static void main(String[] args) {

    }

    int m, n, k;
    boolean[][] visited;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        this.visited = new boolean[m][n];
        int count = dfs(0, 0, k, visited);
        return count;
    }
    //深度
    public int dfs(int i, int j, int k, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= m || j >= n || visited[i][j] || cal(i) + cal(j) > k) {
            return 0;
        }
        visited[i][j] = true;
        return 1 + dfs(i - 1, j, k, visited) + dfs(i + 1, j, k, visited)
                + dfs(i, j - 1, k, visited) + dfs(i, j + 1, k, visited);
    }


    public int cal(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
