package easy.solution_1;

// 1. Two Sum

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution_1 {

    //public int[] twoSum(int[] nums, int target) {
    //
    //    //int[] ans = new int[2];
    //    int[] ans = null;
    //
    //    for (int i = 0; i < nums.length; i++) {
    //        for (int j = i + 1; j < nums.length; j++) {
    //            if ((nums[i] + nums[j]) == target) {
    //                //ans[0] = i;
    //                //ans[1] = j;
    //                ans = new int[]{i, j};
    //                return ans;
    //            }
    //        }
    //    }
    //
    //    return null;
    //}

    //public int[] twoSum(int[] nums, int target) {
    //    for (int i = 0; i < nums.length - 1; i++) {
    //        for (int j = i + 1; j < nums.length; j++) {
    //            if (nums[i] + nums[j] == target) {
    //                return new int[]{i, j};
    //            }
    //        }
    //    }
    //    return null;
    //}

    //// Not as good as the first one because when there are more than one solution, it will return the last solution
    //public int[] twoSum(int[] nums, int target) {
    //
    //    int[] ans = null;
    //
    //    for (int i = 0; i < nums.length - 1; i++) {
    //        for (int j = i + 1; j < nums.length; j++) {
    //            if ((nums[i] + nums[j]) == target) {
    //                ans = new int[]{i, j};
    //                break;
    //            }
    //        }
    //    }
    //
    //    return ans;
    //}

    //// Breaking 2 loops at the same time
    //public int[] twoSum(int[] nums, int target) {
    //
    //    int[] ans = null;
    //
    //    label1: for (int i = 0; i < nums.length - 1; i++) {
    //        for (int j = i + 1; j < nums.length; j++) {
    //            if ((nums[i] + nums[j]) == target) {
    //                ans = new int[]{i, j};
    //                break label1;
    //            }
    //        }
    //    }
    //
    //    return ans;
    //}

    //public int[] twoSum(int[] nums, int target) {
    //
    //    HashMap<Integer, Integer> map = new HashMap<>();
    //    int[] ans = new int[2];
    //
    //    for (int i = 0; i < nums.length; i++) {
    //        map.put(nums[i], i);
    //    }
    //
    //    // 3, 0
    //    // 2, 1
    //    // 4, 2
    //
    //    //  j = 6-3 = 3
    //    System.out.println(map);
    //    for (int i = 0; i < nums.length; i++) {
    //        int j = target - nums[i];
    //        System.out.println(j);
    //        if (map.containsKey(j) && map.get(j) != i) {
    //            System.out.println(map.get(j));
    //            System.out.println(i);
    //            ans[0] = map.get(j);
    //            ans[1] = i;
    //            return ans;
    //        }
    //    }
    //
    //    return ans;
    //}

    //// In case of nums = {3, 3} and target = 6, the map will only have one key 3 with the value 1 (not 0) because the value was re-assigned to 1 (re-assigned to the higher index). That's why the code will work.
    //public int[] twoSum(int[] nums, int target) {
    //
    //    Map<Integer, Integer> map = new HashMap<>();
    //
    //    for (int i = 0; i < nums.length; i++) {
    //        map.put(nums[i], i);
    //    }
    //
    //    for (int i = 0; i < nums.length; i++) {
    //        int j = target - nums[i];
    //        if (map.containsKey(j) && map.get(j) != i) {
    //            return new int[]{i, map.get(j)}; // For Map, we can get value from key, but we cannot get key from value.
    //        }
    //    }
    //
    //    return null;
    //}

    // Fastest
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];

            if (map.containsKey(j)) {
                return new int[]{i, map.get(j)}; // For Map, we can get value from key, but we cannot get key from value.
            }

            map.put(nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        Solution_1 solution = new Solution_1();

        //int[] nums1 = new int[]{2, 7, 11, 15};
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println(Arrays.toString(solution.twoSum(nums1, target1)));
        System.out.println();

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println(Arrays.toString(solution.twoSum(nums2, target2)));
        System.out.println();

        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println(Arrays.toString(solution.twoSum(nums3, target3)));
        System.out.println();

        int[] nums4 = {2, 7, 11, 15};
        int target4 = 99;
        System.out.println(Arrays.toString(solution.twoSum(nums4, target4)));
        System.out.println();

        int[] nums5 = {2, 7, 11, 15, 3, 6};
        int target5 = 9;
        System.out.println(Arrays.toString(solution.twoSum(nums5, target5)));
        System.out.println();
    }

}

