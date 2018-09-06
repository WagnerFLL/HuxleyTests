package q319;

public class q319 {

    public static int run(int n, int[][] intervals) {

        int elo = n - 1, k;
        int[] aux = new int[]{0,0};

        while (elo > 0) {
            if (intervals[elo][0] < intervals[elo][1]) {
                aux[0] = intervals[elo][0];
                intervals[elo][0] = intervals[elo][1];
                intervals[elo][1] = aux[0];
            }
            elo--;
        }
        elo = n;

        for (int i = 0; i < elo; i++) {
            for (int j = i + 1; j < elo; j++) {
                if (intervals[i][0] > intervals[j][0]) {
                    aux[0] = intervals[i][0];
                    aux[1] = intervals[i][1];
                    intervals[i][0] = intervals[j][0];
                    intervals[i][1] = intervals[j][1];
                    intervals[j][0] = aux[0];
                    intervals[j][1] = aux[1];
                }
            }
        }

        for (int i = 0; i < elo; i++) {
            k = intervals[i][0];
            intervals[i][0] = intervals[i][1];
            intervals[i][1] = k;
        }

        int i = 0, j;
        while (i < elo - 1) {

            for (j = i + 1; j < elo; j++) {

                if (intervals[i][1] >= intervals[j][0]) n--;

                else {
                    i = j;
                    break;
                }
            }

            if (j == elo) break;
        }

        return n;
    }
}