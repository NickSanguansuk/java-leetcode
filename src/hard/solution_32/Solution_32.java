package hard.solution_32;

// 32. Longest Valid Parentheses

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution_32 {

    //public int longestValidParentheses(String s) {
    //
    //    Stack<Integer> stack = new Stack<>();
    //    int len = 0;
    //    stack.push(-1);
    //
    //    for (int i = 0; i < s.length(); i++) {
    //        if (s.charAt(i) == '(') {
    //            stack.push(i);
    //        } else {
    //            stack.pop();
    //            if (stack.isEmpty()) {
    //                stack.push(i);
    //            } else {
    //                int m = i - stack.peek();
    //                len = Math.max(m, len);
    //            }
    //        }
    //    }
    //
    //    return len;
    //}

    public int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        int len = 0;
        int left = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {
                    left = i;
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        len = Math.max(len, i-left);
                    } else {
                        len = Math.max(len, i-stack.peek());
                    }
                }
            }
        }

        return len;
    }

    public static void main(String[] args) {
        Solution_32 solution = new Solution_32();

        String s1 = "(()"; // 2
        System.out.println(solution.longestValidParentheses(s1));

        String s2 = ")()())"; // 4
        System.out.println(solution.longestValidParentheses(s2));

        String s3 = ")()))(()))"; // 4
        System.out.println(solution.longestValidParentheses(s3));
    }
}
