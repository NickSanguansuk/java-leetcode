package interview.walmart.interview_2023_07_12;

// Given a number, and determine how many levels of stairs can be formed. For example, given 6, can form 3 levels because 1+2+3. Given 7, still 3 levels, because 6<7<10, and 10 is what you need to form 4 levels of stairs.

// 1
// 2 3
// 4 5 6

public class Interview_a {

    public int determineNumberOfLevelsOfStairs(int num) {
        int ans = 0;
        int levelSize = 1;

        while (num >= levelSize) {
            ans++;
            num -= levelSize;
            levelSize++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Interview_a solution = new Interview_a();

        // 3
        int num1 = 6;
        System.out.println(solution.determineNumberOfLevelsOfStairs(num1));

        // 3
        int num2 = 7;
        System.out.println(solution.determineNumberOfLevelsOfStairs(num2));

        // 4
        int num3 = 10;
        System.out.println(solution.determineNumberOfLevelsOfStairs(num3));

        // 4
        int num4 = 12;
        System.out.println(solution.determineNumberOfLevelsOfStairs(num4));
    }

}
