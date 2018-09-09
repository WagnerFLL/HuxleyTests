package q951;

public class q951 {

    private static String value = "";

    private static void set(int i, int j, int n, int nq) {

        if (n == 0) return;

        if (j >= nq / 2 && n != 0) {

            if (i >= nq / 2) {
                value += '4';
                i -= nq / 2;
                j -= nq / 2;
                set(i, j, n - 1, nq / 2);

            } else {
                value += '1';
                j -= nq / 2;
                set(i, j, n - 1, nq / 2);
            }

        } else {
            value += '2';
            set(i, j, n - 1, nq / 2);
        }

    }

    public static String run(int nq, char[][] map) {
        assert nq > 0 && map != null;
        int n = 0, exp, fi = 0, fj = 0;

        value = "";

        if (nq == 1) {
            return "0";
        }

        for (int i = 0; i < nq; i++) {
            for (int j = 0; j < nq; j++) {
                if (map[i][j] == '*') {
                    fi = i;
                    fj = j;
                }
            }
        }

        exp = nq;
        while (exp / 2 != 1) {
            exp /= 2;
            n++;
        }

        set(fi, fj, n + 1, nq);

        value += 0;
        return value;
    }

}