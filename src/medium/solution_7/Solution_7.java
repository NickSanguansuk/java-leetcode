package medium.solution_7;

// 7. Reverse Integer

public class Solution_7 {

    // Using long (64-bit integers)
    public int reverse(int x) {
        long ans = 0;

        while (x != 0) {
            int tmp = x % 10;
            ans = ans * 10 + tmp;
            x /= 10;
        }

        if (ans < Math.pow(-2, 31) || ans > Math.pow(2, 31)) {
            return 0;
        } else {
            return (int) ans;
        }
    }

    public static void main(String[] args) {
        Solution_7 solution = new Solution_7();

        // 321
        int x1 = 123;
        System.out.println(solution.reverse(x1));

        // -321
        int x2 = -123;
        System.out.println(solution.reverse(x2));

        // 21
        int x3 = 120;
        System.out.println(solution.reverse(x3));

        // 2001
        int x4 = 100200;
        System.out.println(solution.reverse(x4));
    }
}
