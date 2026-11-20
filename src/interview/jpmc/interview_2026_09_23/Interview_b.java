package interview.jpmc.interview_2026_09_23;

//

import java.util.Arrays;
import java.util.List;

public class Interview_b {

    //public static String findNumber (List<Integer> arr, int k)  {
    //    return arr.stream().anyMatch(num -> num == k) ? "YES" : "NO";
    //}

    public static String findNumber (List<Integer> arr, int k)  {
        for (int num : arr) {
            if (num == k) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        Interview_b solution = new Interview_b();

        // YES
        //List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        int k1 = 4;
        System.out.println(Interview_b.findNumber(list1, k1));

        // NO
        //List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> list2 = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        int k2 = 9;
        System.out.println(Interview_b.findNumber(list2, k2));
    }
}
