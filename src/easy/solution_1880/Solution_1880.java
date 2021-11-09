package easy.solution_1880;

// 1880. Check if Word Equals Summation of Two Words

public class Solution_1880 {

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        char aLetter = 'a';
        int firstValue = 0;
        int secondValue = 0;
        int targetValue = 0;

        int len = firstWord.length();
        for (int i = 0; i < len; ++i) {
            char c = firstWord.charAt(i);
            firstValue = (firstValue * 10) + (c - aLetter);
        }

        len = secondWord.length();
        for (int i = 0; i < len; ++i) {
            char c = secondWord.charAt(i);
            secondValue = (secondValue * 10) + (c - aLetter);
        }

        len = targetWord.length();
        for (int i = 0; i < len; ++i) {
            char c = targetWord.charAt(i);
            targetValue = (targetValue * 10) + (c - aLetter);
        }

        return firstValue + secondValue == targetValue;
    }

    public static void main(String[] args) {

        Solution_1880 solution = new Solution_1880();

        System.out.println(solution.isSumEqual("acb", "cba", "cdb"));
        System.out.println(solution.isSumEqual("aaa", "a", "aab"));
    }
}
