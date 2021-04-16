package dcp.problem858;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class RunningMedianTest {

    @Test
    void test() {
        RunningMedian runningMedian = new RunningMedian();
        assertEquals(2.0, runningMedian.computeRunningMedian(2));
        assertEquals(1.5, runningMedian.computeRunningMedian(1));
        assertEquals(2.0, runningMedian.computeRunningMedian(5));
        assertEquals(3.5, runningMedian.computeRunningMedian(7));
        assertEquals(2.0, runningMedian.computeRunningMedian(2));
        assertEquals(2.0, runningMedian.computeRunningMedian(0));
        assertEquals(2.0, runningMedian.computeRunningMedian(5));

    }

}
