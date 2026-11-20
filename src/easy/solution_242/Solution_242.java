package easy.solution_242;

// 242. Valid Anagram

import java.util.*;

public class Solution_242 {

    //public boolean isAnagram(String s, String t) {
    //    if (s.length() != t.length()) {
    //        return false;
    //    }
    //
    //    List<String> listS = new ArrayList<>(List.of(s.split("")));
    //    List<String> listT = new ArrayList<>(List.of(t.split("")));
    //
    //    Collections.sort(listS);
    //    Collections.sort(listT);
    //
    //    for (int i = 0; i < listS.size(); i++) {
    //        if (!listS.get(i).equals(listT.get(i))) {
    //            return false;
    //        }
    //    }
    //
    //    return true;
    //}

    //public boolean isAnagram(String s, String t) {
    //    //if (s.length() != t.length()) { // This is slower
    //    //    return false;
    //    //}
    //
    //    char[] arrS = s.toCharArray();
    //    char[] arrT = t.toCharArray();
    //
    //    if (arrS.length != arrT.length) { // This is faster
    //        return false;
    //    }
    //
    //    Arrays.sort(arrS);
    //    Arrays.sort(arrT);
    //
    //    for (int i = 0; i < arrS.length; i++) {
    //        if (arrS[i] != arrT[i]) {
    //            return false;
    //        }
    //    }
    //
    //    return true;
    //}

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];

        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            arr[c - 'a']--;
        }

        for (int v : arr) {
            if (v != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution_242 solution = new Solution_242();

        // true
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(solution.isAnagram(s1, t1));

        // false
        String s2 = "rat";
        String t2 = "car";
        System.out.println(solution.isAnagram(s2, t2));

        // true
        String s3 = "iceman";
        String t3 = "cinema";
        System.out.println(solution.isAnagram(s3, t3));

        // false
        String s4 = "zzziceman";
        String t4 = "cinemazzy";
        System.out.println(solution.isAnagram(s4, t4));

        // false
        String s5 = "aacc";
        String t5 = "ccac";
        System.out.println(solution.isAnagram(s5, t5));
    }
}
