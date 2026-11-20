package codewars.kyu6.berlin_clock;

import org.junit.jupiter.api.Test; // JUnit 5
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void sampleTests() {
        assertEquals("O\nRROO\nRROO\nYYRYYRYYRYY\nYOOO", Solution.clock("12:56:01"), "For input \"12:56:01\"");
        assertEquals("Y\nOOOO\nOOOO\nOOOOOOOOOOO\nOOOO", Solution.clock("00:00:00"), "For input \"00:00:00\"");
        assertEquals("O\nRRRR\nRROO\nYYRYYROOOOO\nYYOO", Solution.clock("22:32:45"), "For input \"22:32:45\"");
    }
}
