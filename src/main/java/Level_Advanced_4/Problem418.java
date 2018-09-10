package Level_Advanced_4;

public class Problem418 {

    private static int[] array;
    private static String value;

    private static int verf(int num, int n) {
        int i;

        for (i = 0; i < n; i++) {
            if (array[i] == num)
                return 0;
        }
        return 1;
    }

    private static void bt(int n, int p) {

        int i;

        if (n == p) {
            for (i = 0; i < n; i++) {
                value += array[i];
            }
            value += "\n";
        } else {
            for (i = 1; i <= n; i++) {
                if (verf(i, p) == 1) {
                    array[p] = i;
                    bt(n, p + 1);
                }
            }
        }
    }

    public static String run(int n) {

        assert n > 0 && n < 11;

        int i, s = 0;

        array = new int[n];
        value = "";

        for (i = 0; i <= n; i++) {
            s += i;
        }

        bt(n, 0);

        return value;
    }

}
