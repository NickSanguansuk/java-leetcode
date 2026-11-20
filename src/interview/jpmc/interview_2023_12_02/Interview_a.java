package interview.jpmc.interview_2023_12_02;

// 1. Is Possible
// Consider a pair of integers, (a, b). The following operations can be performed on (a, b) in any order, zero or more times
//      (a, b) --> (a + b, b)
//      (a, b) --> (a, a + b)
// Return a string that denotes whether (a, b) can be converted to (c, d) by performing the operation zero or more times.

public class Interview_a {

    public String isPossible(int a, int b, int c, int d) {

        while (c > a || d > b) {
            if (c > d) {
                c = c - d;
            } else if (d > c) {
                d = d - c;
            } else {
                return "No";
            }
        }

        if (a == c && b == d) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Interview_a solution = new Interview_a();

        // Yes
        int a1 = 1, b1 = 4;
        int c1 = 5, d1 = 9;
        System.out.println(solution.isPossible(a1, b1, c1, d1));

        // No
        int a2 = 1, b2 = 2;
        int c2 = 3, d2 = 6;
        System.out.println(solution.isPossible(a2, b2, c2, d2));

        // Yes
        int a3 = 2, b3 = 2;
        int c3 = 2, d3 = 1000;
        System.out.println(solution.isPossible(a3, b3, c3, d3));

        // Yes
        // 62   45
        // 17   45
        // 17   28
        // 17   11
        // 6    11
        // 6    5
        // 1    5
        // 1    4
        int a4 = 1, b4 = 4;
        int c4 = 62, d4 = 45;
        System.out.println(solution.isPossible(a4, b4, c4, d4));

    }
}
