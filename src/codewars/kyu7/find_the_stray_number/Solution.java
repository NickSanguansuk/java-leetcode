package codewars.kyu7.find_the_stray_number;

public class Solution {

    // Finds the single unique integer in an odd-length array of identical numbers.
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    static int stray(int[] numbers) {
        int result = 0;
        for (int num : numbers) {
            result ^= num; // Every duplicate appears an even number of times, so XORing them all together will cancel out the duplicates and leave only the stray number.
        }
        return result;
    }
}
