package search;

import java.util.List;

public class DeleteAndEarn {

    public static long deleteAndEarn(List<Integer> elements) {
        int[] count = new int[100001];
        for (int x: elements) {
            count[x]++;
        }

        int avoid = 0, using = 0, prev = -1;

        for (int k = 0; k < 100001; ++k) {
            if (count[k] > 0) {
                int m = Math.max(avoid, using);
                if (k - 1 != prev) {
                    using = k * count[k] + m;
                    avoid = m;
                } else {
                    using = k * count[k] + avoid;
                    avoid = m;
                }
                prev = k;
            }
        }
        return Math.max(avoid, using);
    }

}
