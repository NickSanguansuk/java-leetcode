package interview.wipro.interview_2023_07_03;

// Reverse the string but keep the positions of the spaces
// and
// Find the second-lengthiest word in a string

public class Interview {

    public String reverseStringButKeepTheSpaces(String str) {
        String ans = "";
        int index = 1;

        for (int i = 0; i < str.length() - index + 1; i++) {
            if (str.charAt(i) == ' ') {
                ans += ' ';
                index--;
            } else {
                if (str.charAt(str.length() - i - index) == ' ') {
                    index++;
                }

                ans += str.charAt(str.length() - i - index);
            }
        }

        return ans;
    }

    public String findSecondLengthiestWordInString(String str) {
        String ans = "";
        int countResult = 0;
        String longest = "";
        int countLongest = 0;

        String tmp = "";
        int countTmp = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (countTmp > countLongest) {
                    ans = longest;
                    countResult = countLongest;
                    longest = tmp;
                    countLongest = countTmp;
                } else if (countTmp > countResult) {
                    ans = tmp;
                    countResult = countTmp;
                }

                tmp = "";
                countTmp = 0;
            } else {
                tmp += str.charAt(i);
                countTmp++;
            }
        }

        if (countTmp > countLongest) {
            ans = longest;
            countResult = countLongest;
            longest = tmp;
            countLongest = countTmp;
        } else if (countTmp > countResult) {
            ans = tmp;
            countResult = countTmp;
        }

        return ans;
    }

    public static void main(String[] args) {
        Interview solution = new Interview();

        String str = "I am from California";
        // a in rofi laCmorfmaI

        System.out.println(solution.reverseStringButKeepTheSpaces(str));

        System.out.println("----------");

        System.out.println(solution.findSecondLengthiestWordInString(str));
    }
}


