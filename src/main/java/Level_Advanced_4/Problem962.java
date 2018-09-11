package Level_Advanced_4;

public class Problem962 {

    public static String run(int n) {

        assert n > 0 && n < 100;

        String value = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j)
                    value += (i + 1);
                else
                    value += (j + 1);
                if (j != n - 1)
                    value += " ";
            }
            value += "\n";
        }
        return value;
    }

}
