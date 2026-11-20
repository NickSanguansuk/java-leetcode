package medium.solution_692;

// 692. Top K Frequent Words

import java.util.*;

public class Solution_692 {

    //public List<String> topKFrequent(String[] words, int k) {
    //    List<String> result = new LinkedList<>();
    //
    //    Map<String, Integer> map = new HashMap<>();
    //
    //    for (int i = 0; i < words.length; i++) {
    //        if (map.containsKey(words[i])) {
    //            map.put(words[i], map.get(words[i]) + 1);
    //        } else {
    //            map.put(words[i], 1);
    //        }
    //    }
    //
    //    for (Map.Entry<String, Integer> e : map.entrySet()) {
    //        String eKey = e.getKey();
    //        int eValue = e.getValue();
    //
    //        int i = result.size();
    //        while (i - 1 >= 0) {
    //            String tmpKey = result.get(i - 1);
    //            int tmpValue = map.get(tmpKey);
    //
    //            if (eValue < tmpValue) {
    //                break;
    //            } else if (eValue == tmpValue) {
    //                int compare = eKey.compareTo(tmpKey);
    //                if (compare > 0) {
    //                    break;
    //                }
    //            }
    //
    //            i--;
    //        }
    //
    //        if (i < k) {
    //            result.add(i, e.getKey());
    //        }
    //
    //        if (result.size() > k) {
    //            //result.remove(k);
    //            result.remove(result.size() - 1);
    //        }
    //    }
    //
    //    return result;
    //}

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> sortedWords = new ArrayList<>(map.keySet());
        sortedWords.sort((a, b) -> {
            int freqCompare = map.get(b).compareTo(map.get(a)); // Descending
            if (freqCompare == 0) {
                return a.compareTo(b); // Ascending
            }
            return freqCompare;
        });

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(sortedWords.get(i));
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution_692 solution = new Solution_692();

        // [i, love]
        String[] words1 = {"i", "love", "leetcode", "i", "love", "coding"};
        int k1 = 2;
        System.out.println(solution.topKFrequent(words1, k1));

        // [the, is, sunny, day]
        String[] words2 = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k2 = 4;
        System.out.println(solution.topKFrequent(words2, k2));

        // [a, aa]
        String[] words3 = {"a", "aa", "aaa"};
        int k3 = 2;
        System.out.println(solution.topKFrequent(words3, k3));
    }
}
