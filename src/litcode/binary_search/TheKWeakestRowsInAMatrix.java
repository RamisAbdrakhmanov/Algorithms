package litcode.binary_search;

import java.util.PriorityQueue;

public class TheKWeakestRowsInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Row> rows = new PriorityQueue<>();
        for (int i = 0; i < mat.length; i++) {
            int solders = countSolder(mat[i]);
            rows.add(new Row(solders, i));
        }
        int[] ans = new int[k];
        for (int i = 0; i < ans.length ; i++) {
            ans[i] = rows.poll().line;
        }
        return ans;
    }

    private int countSolder(int[] row) {
        if(row[0] == 0){
            return 0;
        }

        int l = 0;
        int r = row.length - 2;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (row[m] == 1 && row[m+1] == 0) {
                return m + 1;
            } else if (row[m] == 1) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return row.length;
    }

    class Row implements Comparable<Row> {

        int solders;
        int line;

        public Row(int solders, int line) {
            this.solders = solders;
            this.line = line;
        }


        @Override
        public int compareTo(Row o) {
            if (this.solders == o.solders) {
                return  this.line  - o.line;
            }

            return this.solders - o.solders;
        }
    }
}
