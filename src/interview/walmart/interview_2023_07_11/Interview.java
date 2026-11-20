package interview.walmart.interview_2023_07_11;

// Convert a string to integer. Not using parse method in java. “123” to 123

public class Interview {

    //public int convertStringToInteger(String str) {
    //    int result = 0;
    //    boolean isNegative = false;
    //
    //    if (str.charAt(0) == '-') {
    //        isNegative = true;
    //        str = str.substring(1);
    //    }
    //
    //    int len = str.length();
    //
    //    for (int i = 0; i < len; i++) {
    //        result += (str.charAt(len - i - 1) - '0') * ((int) Math.pow(10, i));
    //    }
    //
    //    if (isNegative) {
    //        result = -result;
    //    }
    //
    //    return result;
    //}

    public int convertStringToInteger(String str) {
        int ans = 0;
        boolean isNegative = false;

        if (str.charAt(0) == '-') {
            isNegative = true;
            str = str.substring(1);
        }

        int len = str.length();

        for (int i = 0; i < len; i++) {
            ans = (ans * 10) + (str.charAt(i) - '0');
        }

        if (isNegative) {
            ans = -ans;
        }

        return ans;
    }

    public static void main(String[] args) {
        Interview solution = new Interview();

        String str1 = "25981";
        //System.out.println(solution.convertStringToInteger(str1));
        int result1 = solution.convertStringToInteger(str1);
        System.out.println(result1);

        String str2 = "-5731";
        int result2 = solution.convertStringToInteger(str2);
        System.out.println(result2);

    }

}
