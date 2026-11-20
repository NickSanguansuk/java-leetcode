package hard.solution_140;

// 140. Word Break II

import java.util.*;

public class Solution_140 {

    HashMap<String, List<String>> memo;

    public List<String> wordBreak(String s, List<String> wordDict) {
        memo = new HashMap<>();
        Set<String> set = new HashSet<>(wordDict);
        List<String> lastResults = getList(set, s);

        return lastResults;
    }

    private List<String> getList(Set<String> set, String s) {

        List<String> results = new ArrayList<>();

        if (memo.containsKey(s)) {
            return memo.get(s);
        }

        if (s.equals("")) {
            //System.out.println("1--> " + "");
            results.add("");
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            String right = s.substring(i);
            if (set.contains(right)) {
                List<String> lefts = getList(set, s.substring(0, i));
                //System.out.println("***** " + lefts);
                for (String left : lefts) {
                    if (left.equals("")) {
                        //System.out.println("2--> " + right);
                        results.add(right);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(left);
                        sb.append(" ");
                        sb.append(right);
                        //System.out.println("3--> " + sb.toString());
                        results.add(sb.toString());
                    }
                }
            }
        }

        memo.put(s, results);

        //System.out.println("-----> " + results);

        return results;
    }

    public static void main(String[] args) {
        Solution_140 solution = new Solution_140();

        //String s1 = "catsanddog";
        //List<String> wordDict1 = new ArrayList<>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
        //System.out.println(solution.wordBreak(s1, wordDict1));

        String s2 = "pineapplepenapple";
        List<String> wordDict2 = new ArrayList<>(Arrays.asList("apple", "pen", "applepen", "pine", "pineapple"));
        System.out.println(solution.wordBreak(s2, wordDict2));

        //String s3 = "catsandog";
        //List<String> wordDict3 = new ArrayList<>(Arrays.asList("cats","dog","sand","and","cat"));
        //System.out.println(solution.wordBreak(s3, wordDict3));
    }
}
