package codewars.kyu7.find_the_stray_number;

public class Solution {
    static int stray(int[] numbers) {
        int result = 0;
        for (int num : numbers) {
            result ^= num; // Every duplicate appears an even number of times, so XORing them all together will cancel out the duplicates and leave only the stray number.
        }
        return result;
    }
}
