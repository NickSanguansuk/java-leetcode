package medium.solution_17;

// 17. Letter Combinations of a Phone Number
// Same as "interview.fidelity.interview_2023_12_15.Interview_2023_12_15"
// Given a String containing digits from 2-9 inclusive, return all possible letter combination that the number could represent.
// Return the answer in any order, mapping of digits to letters

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_17 {

    private static final Map<Character, List<Character>> map = new HashMap<>();
    static {
        map.put('2', List.of('a', 'b', 'c'));
        map.put('3', List.of('d', 'e', 'f'));
        map.put('4', List.of('g', 'h', 'i'));
        map.put('5', List.of('j', 'k', 'l'));
        map.put('6', List.of('m', 'n', 'o'));
        map.put('7', List.of('p', 'q', 'r', 's'));
        map.put('8', List.of('t', 'u', 'v'));
        map.put('9', List.of('w', 'x', 'y', 'z'));
    }

    //public List<String> letterCombinations(String digits) {
    //    List<String> ans = new ArrayList<>();
    //
    //    if (digits == null || digits.length() == 0) {
    //        return ans;
    //    }
    //
    //    letterCombinationsHelper(digits, 0, "", ans);
    //
    //    return ans;
    //}
    //
    //private void letterCombinationsHelper(String digits, int index, String text, List<String> ans) {
    //    if (index == digits.length()) {
    //        ans.add(text);
    //        return;
    //    }
    //
    //    for (char c : map.get(digits.charAt(index))) {
    //        String newText = text + c;
    //        letterCombinationsHelper(digits, index + 1, newText, ans);
    //    }
    //}

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return ans;
        }

        letterCombinationsHelper(digits, 0, new StringBuilder(), ans);

        return ans;
    }

    private void letterCombinationsHelper(String digits, int index, StringBuilder sb, List<String> ans) {
        if (index == digits.length()) {
            ans.add(sb.toString());
            return;
        }

        for (char c : map.get(digits.charAt(index))) {
            sb.append(c);
            letterCombinationsHelper(digits, index + 1, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        Solution_17 solution = new Solution_17();

        // ad ae af bd be bf cd ce cf
        String str1 = "23";
        System.out.println(solution.letterCombinations(str1));

        // w x y z
        String str2 = "9";
        System.out.println(solution.letterCombinations(str2));

        // dma dmb dmc dna dnb dnc doa dob doc
        // ema emb emc ena enb enc eoa eob eoc
        // fma fmb fmc fna fnb fnc foa fob foc
        String str3 = "362";
        System.out.println(solution.letterCombinations(str3));
    }
}
