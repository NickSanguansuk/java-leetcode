package interview.heartcentrix.interview_2026_10_07;

// Print all Peak-Valley Numbers from 100 to 9999.
// A number is a Peak-Valley Number if every digit, except the first and last,
// is either strictly greater than both of its neighboring digits or strictly smaller than both of its neighboring digits. (different from LeetCode 2210)

public class Interview {

    public boolean isPeakValley(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        //char[] digits = (num + "").toCharArray();

        for (int i = 1; i < digits.length - 1; i++) {
            int current = digits[i] - '0';
            int left = digits[i - 1] - '0';
            int right = digits[i + 1] - '0';

            if (!((current > left && current > right) || (current < left && current < right))) {
                return false;
            }
        }
        return true;
    }

    public void printPeakValleyNumbers() {
        for (int i = 100; i <= 9999; i++) {
            if (isPeakValley(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Interview solution = new Interview();

        // Verification Examples
        System.out.println("121: " + solution.isPeakValley(121));   // true
        System.out.println("2323: " + solution.isPeakValley(2323)); // true
        System.out.println("123: " + solution.isPeakValley(123));   // false
        System.out.println("1221: " + solution.isPeakValley(1221)); // false

        // Run full sequence print
        System.out.println("\n--- Printing All Values ---");
        solution.printPeakValleyNumbers();
    }
}
