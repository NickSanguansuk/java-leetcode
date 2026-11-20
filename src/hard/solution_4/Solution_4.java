package hard.solution_4;

// 4. Median of Two Sorted Arrays

import java.util.ArrayList;

public class Solution_4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;
        ArrayList<Integer> resultList = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                resultList.add(nums1[i]);
                i++;
            } else {
                resultList.add(nums2[j]);
                j++;
            }
        }

        while (i < nums1.length) {
            resultList.add(nums1[i]);
            i++;
        }

        while (j < nums2.length) {
            resultList.add(nums2[j]);
            j++;
        }

        int index = resultList.size() / 2;
        if (resultList.size() % 2 != 0) {
            return resultList.get(index);
        } else {
            return (resultList.get(index - 1) + resultList.get(index)) / 2.0;
        }
    }

    public static void main(String[] args) {
        Solution_4 solution = new Solution_4();

        int[] nums1_1 = {1, 3};
        int[] nums2_1 = {2};
        System.out.println(solution.findMedianSortedArrays(nums1_1, nums2_1));  // 2.0

        int[] nums1_2 = {1, 2};
        int[] nums2_2 = {3, 4};
        System.out.println(solution.findMedianSortedArrays(nums1_2, nums2_2));  // 2.5
    }
}
