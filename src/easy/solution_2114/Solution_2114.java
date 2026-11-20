package easy.solution_2114;

// 2114. Maximum Number of Words Found in Sentences

public class Solution_2114 {

    //public int mostWordsFound(String[] sentences) {
    //    int result = 0;
    //
    //    for (int i = 0; i < sentences.length; i++) {
    //        int numWords = sentences[i].trim().split(" ").length;
    //
    //        result = Math.max(result, numWords);
    //    }
    //
    //    return result;
    //}

    public int mostWordsFound(String[] sentences) {
        int ans = 0;

        for (int i = 0; i < sentences.length; i++) {
            int numWords = countWordsHelper(sentences[i]);

            if (numWords > ans) {
                ans = numWords;
            }
        }

        return ans;
    }
    private int countWordsHelper(String str) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution_2114 solution = new Solution_2114();

        String[] sentences1 = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(solution.mostWordsFound(sentences1));

        String[] sentences2 = new String[]{"please wait", "continue to fight", "continue to win"};
        System.out.println(solution.mostWordsFound(sentences2));

        //String[] sentences3 = new String[]{" please wait ", "   continue to fight", "continue to win   "};
        //System.out.println(solution.mostWordsFound(sentences3));
    }
}
