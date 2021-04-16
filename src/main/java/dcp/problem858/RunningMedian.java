package dcp.problem858;

import java.util.PriorityQueue;

public class RunningMedian {

    private double median = 0;
    private final PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);
    private final PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

    public double computeRunningMedian(int value) {

        int delta = maxHeap.size() - minHeap.size();

        if (delta == 0) {
            if (value < median) {
                maxHeap.add(value);
                median = maxHeap.peek();
            } else {
                minHeap.add(value);
                median = minHeap.peek();
            }
            return median;
        }

        if (delta == 1) {
            if (value < median) {
                minHeap.add(maxHeap.remove());
                maxHeap.add(value);
            } else {
                minHeap.add(value);
            }
        }

        if (delta == -1) {
            if (value < median) {
                maxHeap.add(value);
            } else {
                maxHeap.add(minHeap.remove());
                minHeap.add(value);
            }
        }
        median = (minHeap.peek() + maxHeap.peek()) / 2.0;
        return median;
    }
}
