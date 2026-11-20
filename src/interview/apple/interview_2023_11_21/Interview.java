package interview.apple.interview_2023_11_21;

// Find the length of the last word (Without using .split())

public class Interview {

    public int returnLastWordInString(String str) {
        int ans = 0;

        for (int i = str.length(); i > 0; i--) {
            if (str.charAt(i - 1) == ' ') {
                return ans;
            }

            ans++;
        }

        return ans;
    }

    //int returnLastWordInString(String str) {
    //
    //    String[] strings = str.split(" ");
    //    return strings[strings.length - 1].length();
    //}

    public static void main(String[] args) {
        Interview solution = new Interview();

        String str = "I stay in california";

        // 10
        System.out.println(solution.returnLastWordInString(str));
    }
}


