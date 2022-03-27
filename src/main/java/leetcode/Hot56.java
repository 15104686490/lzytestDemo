package leetcode;

import java.util.*;

public class Hot56 {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("", "");
        treeMap.values();
    }

    /**
     * 按照左端排序后，遍历合并区间
     */
    public int[][] merge(int[][] intervals) {
        if (intervals == null) {
            return intervals;
        }
        int length = intervals.length;
        if (length == 0) {
            return new int[0][2];
        }
        /**
         * 根据左端值进行排序
         * */
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });

        List<int[]> merged = new ArrayList<int[]>();
        for (int i = 0; i < length; ++i) {
            int L = intervals[i][0];
            int R = intervals[i][1];
            if (merged.size() == 0 || merged.get(merged.size() - 1)[1] < L) {
                merged.add(new int[]{L, R});
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], R);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }


}
