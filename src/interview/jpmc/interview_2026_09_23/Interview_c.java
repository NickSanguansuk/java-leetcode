package interview.jpmc.interview_2026_09_23;

//

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Interview_c {

    public static List<Integer> oddNumbers(int l, int r) {
        return IntStream.rangeClosed(l, r)
                .filter(num -> num % 2 != 0)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Interview_c solution = new Interview_c();

        // [3, 5, 7, 9]
        int l1 = 3;
        int r1 = 10;
        System.out.println(Interview_c.oddNumbers(l1, r1));

        // [3, 5, 7, 9, 11, 13, 15, 17, 19]
        int l2 = 2;
        int r2 = 20;
        System.out.println(Interview_c.oddNumbers(l2, r2));

    }
}
