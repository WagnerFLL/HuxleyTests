package q892;

public class q892 {

    public static String run(int h, int c, char[][] campo) {

        assert h > 0 && c > 0 && campo != null && campo.length > 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < c; j++) {
                if (campo[i][j] == '&') {

                    if (i + 1 < h) {
                        campo[i + 1][j] = '.';
                        if (j + 1 < c) campo[i + 1][j + 1] = '.';
                        if (j != 0) campo[i + 1][j - 1] = '.';
                    }

                    if (j + 1 < c) campo[i][j + 1] = '.';
                    if (j != 0) campo[i][j - 1] = '.';

                    if (i != 0) {
                        campo[i - 1][j] = '.';
                        if (j != 0) campo[i - 1][j - 1] = '.';
                        if (j + 1 < c) campo[i - 1][j + 1] = '.';
                    }
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < c; j++) {
                if (campo[i][j] == '*') {
                    return "N";
                }
            }
        }
        return "S";
    }

}
