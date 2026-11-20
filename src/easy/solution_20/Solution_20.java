package easy.solution_20;

// 20. Valid Parentheses

public class Solution_20 {

    public boolean isValid(String s) {
        boolean ans = false;



        return ans;
    }

    public static void main(String[] args) {
        Solution_20 solution = new Solution_20();

        // true
        String s1 = "()";
        System.out.println(solution.isValid(s1));

        // true
        String s2 = "()[]{}";
        System.out.println(solution.isValid(s2));

        // false
        String s3 = "(]";
        System.out.println(solution.isValid(s3));

    }
}
