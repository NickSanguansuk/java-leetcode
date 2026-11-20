package codewars.kyu6.berlin_clock;

public class Solution {

    // Converts a 24-hour time string ("hh:mm:ss") into its 5-row Berlin Clock representation.
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public static String clock(String time) {
        String[] times = time.split(":");
        int hours = Integer.parseInt(times[0]);
        int minutes = Integer.parseInt(times[1]);
        int seconds = Integer.parseInt(times[2]);

        String topLight = seconds % 2 == 0 ? "Y" : "O";
        String fiveHourRowLight = buildShortRowLight(hours / 5, "R");
        String oneHourRowLight = buildShortRowLight(hours % 5, "R");
        String fiveMinuteRowLight = buildLongRowLight(minutes / 5);
        String oneMinuteRowLight = buildShortRowLight(minutes % 5, "Y");

        return String.join("\n", topLight, fiveHourRowLight, oneHourRowLight, fiveMinuteRowLight, oneMinuteRowLight);
    }

    // Builds a 4-lamp row (used for 5-hour, 1-hour, and 1-minute rows).
    private static String buildShortRowLight(int count, String color) {
        StringBuilder rowLight = new StringBuilder(4);
        for (int i = 1; i < 5; i++) {
            rowLight.append(i <= count ? color : "O");
        }
        return rowLight.toString();
    }

    // Builds the 11-lamp 5-minute row, marking every 3rd lamp (15, 30, 45 min) red ("R") and others yellow ("Y").
    private static String buildLongRowLight(int count) {
        StringBuilder rowLight = new StringBuilder(11);
        for (int i = 1; i < 12; i++) {
            if (i <= count) {
                rowLight.append(i % 3 == 0 ? "R" : "Y");
            } else {
                rowLight.append("O");
            }
        }
        return rowLight.toString();
    }
}
