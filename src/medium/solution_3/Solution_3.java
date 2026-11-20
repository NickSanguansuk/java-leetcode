package medium.solution_3;

// 3. Longest Substring Without Repeating Characters

import java.util.HashMap;
import java.util.Map;

public class Solution_3 {

    //public int lengthOfLongestSubstring(String s) {
    //    int ans = 0;
    //
    //    Map<Character, Integer> map = new HashMap<>();
    //    int index = 0;
    //
    //    for (int i = 0; i < s.length(); i++) {
    //        if (map.containsKey(s.charAt(i))) {
    //            index = Math.max(index, map.get(s.charAt(i)) + 1); //
    //        }
    //
    //        map.put(s.charAt(i), i);
    //        ans = Math.max(ans, i - index + 1); //
    //    }
    //
    //    return ans;
    //}

    // Initialise index variable to -1 is better to understand
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;

        Map<Character, Integer> map = new HashMap<>();
        int index = -1; // index before the starting point

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                index = Math.max(index, map.get(s.charAt(i))); //
            }

            map.put(s.charAt(i), i);
            ans = Math.max(ans, i - index); //
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution_3 solution = new Solution_3();

        String s1 = "abcabcbb";     // 3
        System.out.println(solution.lengthOfLongestSubstring(s1));

        String s2 = "bbbbb";        // 1
        System.out.println(solution.lengthOfLongestSubstring(s2));

        String s3 = "pwwkew";       // 3
        System.out.println(solution.lengthOfLongestSubstring(s3));

        String s4 = " ";            // 1
        System.out.println(solution.lengthOfLongestSubstring(s4));

        String s5 = "dvdf";         // 3
        System.out.println(solution.lengthOfLongestSubstring(s5));

        String s6 = "dvcfdvcfa";    // 5
        System.out.println(solution.lengthOfLongestSubstring(s6));

        String s7 = "xaybzcdefxghyzi";  // 11 (aybzcdefxgh)
        System.out.println(solution.lengthOfLongestSubstring(s7));

        String s8 = "abcaqwer";     // 7 (bcaqwer)
        System.out.println(solution.lengthOfLongestSubstring(s8));
    }
}
