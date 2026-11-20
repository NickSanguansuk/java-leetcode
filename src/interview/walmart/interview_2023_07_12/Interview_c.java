package interview.walmart.interview_2023_07_12;

// Given a string, split the string into left and right part at any point. The rightmost substring is suffix, leftmost is prefix. Determine the longest prefix between the suffix and the original string. Sum and return the length of the common prefixes.
// ??? (I don't understand the question)

public class Interview_c {

    public int findLongestPrefixSuffixLength(String str) {
        int n = str.length();

        // If n is less than 2
        if (n <= 1) {
            return 0;
        }

        int len = 0;
        int i = (n + 1) / 2;

        while (i < n) {
            // If str.charAt(i) is equal to str.charAt(len)
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                i++;
            } else {
                i = i - len + 1;
                len = 0;
            }
        }

        return len;
    }

    public static void main(String[] args) {
        Interview_c solution = new Interview_c();

        String str = "I am Nick Sang";
        System.out.println(solution.findLongestPrefixSuffixLength(str));

    }

}
