package Level_Advanced_4;

public class Problem829 {

    public static String run(char[] let) {

        assert let != null && let.length == 5;

        int i, dif;

        dif = let[1] - let[0];

        for (i = 2; i < 5; i++) {
            if (let[i] - let[i - 1] != dif || let[i] == let[i - 1]) {
                return "nao";
            }

        }
        return "sim";
    }

}
