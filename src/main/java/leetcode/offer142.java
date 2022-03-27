package leetcode;

public class offer142 {
    public static void main(String[] args) {

    }

    public int cutRope(int n) {
        if (n < 4) {
            return n - 1;
        }
        int b = n % 3;
        int p = 1000000007;
        long rem = 1;
        long x = 3;
        for (int a = n / 3 - 1; a > 0; a /= 2) {
            if (a % 2 == 1) {
                rem = (rem * x) % p;
            }
            x = (x * x) % p;
        }
        if (b == 0) {
            return (int) (rem * 3 % p);
        }
        if (b == 1) {
            return (int) (rem * 4 % p);
        }
        return (int) (rem * 6 % p);
    }
}
