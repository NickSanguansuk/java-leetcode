package medium.solution_12;

// 12. Integer to Roman

import java.util.*;

public class Solution_12 {

    //public String intToRoman(int num) {
    //    // I =    1
    //    // V =    5
    //    // X =   10
    //    // L =   50
    //    // C =  100
    //    // D =  500
    //    // M = 1000
    //
    //    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    //    String[] letters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    //
    //    String result = "";
    //
    //    for (int i = 0; i < values.length; i++) {
    //        while (num >= values[i]) {
    //            //result += letters[i];
    //            //num -= values[i];
    //            int count = num / values[i];
    //            num %= values[i];
    //            while (count > 0) {
    //                result += letters[i];
    //                count--;
    //            }
    //        }
    //    }
    //
    //    return result;
    //}

    private static TreeMap<Integer, String> treeMap = new TreeMap<>();

    static {
        treeMap.put(1000, "M");
        treeMap.put(900, "CM");
        treeMap.put(500, "D");
        treeMap.put(400, "CD");
        treeMap.put(100, "C");
        treeMap.put(90, "XC");
        treeMap.put(50, "L");
        treeMap.put(40, "XL");
        treeMap.put(10, "X");
        treeMap.put(9, "IX");
        treeMap.put(5, "V");
        treeMap.put(4, "IV");
        treeMap.put(1, "I");
    }

    public String intToRoman(int num) {

        int fl = treeMap.floorKey(num);

        if (num == fl) {
            return treeMap.get(fl);
        }

        return treeMap.get(fl) + intToRoman(num - fl);
    }

    public static void main(String[] args) {
        Solution_12 solution = new Solution_12();

        int num1 = 3;       // III
        System.out.println(solution.intToRoman(num1));

        int num2 = 58;      // LVIII
        System.out.println(solution.intToRoman(num2));

        int num3 = 1994;    // MCMXCIV
        System.out.println(solution.intToRoman(num3));
    }
}
