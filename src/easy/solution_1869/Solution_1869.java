package easy.solution_1869;

// 1869. Longer Contiguous Segments of Ones than Zeros

public class Solution_1869 {

    //public boolean checkZeroOnes(String s) {
    //
    //    char[] sArray = s.toCharArray();
    //
    //    int zeroMax = 0;
    //    int oneMax = 0;
    //
    //    //int prev = Integer.parseInt(String.valueOf(sArray[0]));
    //    char prev = sArray[0];
    //
    //    int count = 1;
    //
    //    int len = s.length();
    //
    //    for (int i = 1; i < len; ++i) {
    //        //int curr = Integer.parseInt(String.valueOf(sArray[i]));
    //        char curr = sArray[i];
    //        if (curr == '1') {
    //            if (prev == '1') {
    //                count++;
    //            } else {
    //                if (count > zeroMax) {
    //                    zeroMax = count;
    //                }
    //
    //                prev = curr;
    //                count = 1;
    //            }
    //        } else {
    //            if (prev == '0') {
    //                count++;
    //            } else {
    //                if (count > oneMax) {
    //                    oneMax = count;
    //                }
    //
    //                prev = curr;
    //                count = 1;
    //            }
    //        }
    //    }
    //
    //    if (prev == '1') {
    //        if (count > oneMax) {
    //            oneMax = count;
    //        }
    //    } else {
    //        if (count > zeroMax) {
    //            zeroMax = count;
    //        }
    //    }
    //
    //    return oneMax > zeroMax;
    //}

    public boolean checkZeroOnes(String s) {

        char[] sArray = s.toCharArray();

        int max0 = 0;
        int max1 = 0;

        int count0 = 0;
        int count1 = 0;

        int len = s.length();

        for (int i = 0; i < len; ++i) {
            char curr = sArray[i];
            if (curr == '0') {
                count0++;
                count1 = 0;
                max0 = Math.max(max0, count0);
            } else {
                count1++;
                count0 = 0;
                max1 = Math.max(max1, count1);
            }
        }

        return max1 > max0;
    }

    public static void main(String[] args) {

        Solution_1869 solution = new Solution_1869();

        System.out.println(solution.checkZeroOnes("1101"));
        System.out.println(solution.checkZeroOnes("111000"));

    }
}
