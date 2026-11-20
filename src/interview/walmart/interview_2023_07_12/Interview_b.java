package interview.walmart.interview_2023_07_12;

// There is an array of integers and an arbitrary initial integer x. The x is a running sum plus the current integer from left to right. The sum must not go below 1. Determine the minimum value of X.
// Given, x == 1

public class Interview_b {

    public int findMinSum(int[] arr) {
        int x = 1;

        for (int i = 0; i < arr.length; i++) {
            x += arr[i];
            if (x < 1) {
                x = 1;
            }
        }

        return x;
    }

    public static void main(String[] args) {
        Interview_b solution = new Interview_b();

        int[] arr = {-2, 3, 1, 4, -5};
        System.out.println(solution.findMinSum(arr));

    }

}
