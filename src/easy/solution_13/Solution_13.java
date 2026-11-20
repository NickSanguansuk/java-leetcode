package easy.solution_13;

// 13. Roman to Integer

import java.util.HashMap;
import java.util.Map;

public class Solution_13 {

    //public int romanToInt(String s) {
    //    int ans = 0;
    //
    //    Map<Character, Integer> map = new HashMap<>();
    //    map.put('I', 1);
    //    map.put('V', 5);
    //    map.put('X', 10);
    //    map.put('L', 50);
    //    map.put('C', 100);
    //    map.put('D', 500);
    //    map.put('M', 1000);
    //
    //    for (int i = s.length() - 1; i >= 0; i--) {
    //        int num = map.get(s.charAt(i));
    //        if (num * 4 < ans) {
    //            ans -= num;
    //        } else {
    //            ans += num;
    //        }
    //    }
    //
    //    return ans;
    //}

    //public int romanToInt(String s) {
    //    int ans = 0;
    //    int prev = Integer.MAX_VALUE;
    //
    //    Map<Character, Integer> map = new HashMap<>();
    //    map.put('I', 1);
    //    map.put('V', 5);
    //    map.put('X', 10);
    //    map.put('L', 50);
    //    map.put('C', 100);
    //    map.put('D', 500);
    //    map.put('M', 1000);
    //
    //    for (int i = 0; i < s.length(); i++) {
    //        int num = map.get(s.charAt(i));
    //        if (num > prev) {
    //            ans = ans - (prev * 2) + num;
    //        } else {
    //            ans += num;
    //        }
    //        prev = num;
    //    }
    //
    //    return ans;
    //}

    //public int romanToInt(String s) {
    //    int ans = 0;
    //    int prev = Integer.MAX_VALUE;
    //
    //    for (int i = 0; i < s.length(); i++) {
    //        int num = 0;
    //        switch (s.charAt(i)) {
    //            case 'I':
    //                num = 1;
    //                break;
    //            case 'V':
    //                num = 5;
    //                break;
    //            case 'X':
    //                num = 10;
    //                break;
    //            case 'L':
    //                num = 50;
    //                break;
    //            case 'C':
    //                num = 100;
    //                break;
    //            case 'D':
    //                num = 500;
    //                break;
    //            case 'M':
    //                num = 1000;
    //                break;
    //        }
    //
    //        if (num > prev) {
    //            ans = ans - (prev * 2) + num;
    //        } else {
    //            ans += num;
    //        }
    //        prev = num;
    //    }
    //
    //    return ans;
    //}

    public int romanToInt(String s) {
        int ans = 0;
        int prev = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            int num = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };

            if (num > prev) {
                ans = ans - (prev * 2) + num;
            } else {
                ans += num;
            }
            prev = num;
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution_13 solution = new Solution_13();

        // 3
        String s1 = "III";
        System.out.println(solution.romanToInt(s1));

        // 58
        String s2 = "LVIII";
        System.out.println(solution.romanToInt(s2));

        // 1994
        String s3 = "MCMXCIV";
        System.out.println(solution.romanToInt(s3));
    }
}
