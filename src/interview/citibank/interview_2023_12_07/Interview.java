package interview.citibank.interview_2023_12_07;

// Find the Common Elements in Two Lists

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Interview {

    public List<Integer> findCommonElements(int[] numsA, int[] numsB) {
        List<Integer> listA = Arrays.stream(numsA).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(numsB).boxed().collect(Collectors.toList());

        listA.retainAll(listB);

        return listA;
    }

    public static void main(String[] args) {
        Interview solution = new Interview();

        int[] numsA = {3, 1, 6, 8};
        int[] numsB = {2, 9, 8, 5};

        System.out.println(solution.findCommonElements(numsA, numsB));
    }
}
