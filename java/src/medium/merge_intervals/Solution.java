package medium.merge_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        int p = 1;
        int[] temp = intervals[0];

        while (p < intervals.length) {
            if (isOverlap(intervals[p], temp)) {
                temp = mergeInterval(intervals[p], temp);
            } else {
                result.add(temp);
                temp = intervals[p];
            }
            p++;
        }

        result.add(temp);
        return result.toArray(new int[result.size()][]);
    }

    private boolean isOverlap(int[] interval1, int[] interval2) {
        return interval1[1] >= interval2[0] && interval1[0] <= interval2[1];
    }

    private int[] mergeInterval(int[] interval1, int[] interval2) {
        return new int[]{
                Math.min(interval1[0], interval2[0]),
                Math.max(interval1[1], interval2[1])
        };
    }
}
