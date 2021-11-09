package easy.solution_557;

// 557. Reverse Words in a String III

import easy.solution_27.Solution_27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_557 {

    //public String reverseWords(String s) {
    //    String result = "";
    //    List<String> list = Arrays.asList(s.split(" "));
    //    for (int i = 0; i < list.size(); i++) {
    //        String word = list.get(i);
    //        String newWord = "";
    //        for (int j = 0; j < word.length(); j++) {
    //            char ch = word.charAt(j);
    //            newWord = ch + newWord;
    //        }
    //        result += newWord + " ";
    //    }
    //
    //    return result.trim();
    //}

    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            StringBuilder word = new StringBuilder(arr[i]);
            result.append(word.reverse().toString() + " ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Solution_557 solution = new Solution_557();
        String s = "Let's take LeetCode contest";
        System.out.println(solution.reverseWords(s));
    }
}
