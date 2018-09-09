package q229;

public class q229 {

    public static String run(int lin, int col, int qtdV, int ger, int[][] positions) {

        assert lin > 0 && col > 0 && qtdV > 0 && ger > 0 && null != positions &&positions.length > 0;

        StringBuilder result = new StringBuilder();
        int i, j, viva, a, b;

        lin += 2;
        col += 2;

        int[][] campo = new int[lin][col];
        int[][] clone = new int[lin][col];

        for (i = 0; i < lin; i++) {
            for (j = 0; j < col; j++) {
                campo[i][j] = 0;
            }
        }

        for (i = 0; i < qtdV; i++) {
            a = positions[i][0];
            b = positions[i][1];
            campo[a + 1][b + 1] = 1;
        }

        for (i = 0; i < lin; i++) {
            for (j = 0; j < col; j++) {
                clone[i][j] = campo[i][j];
            }
        }

        while (ger >= 0) {

            for (i = 1; i < lin - 1; i++)
                for (j = 1; j < col - 1; j++) {

                    viva = 0;

                    if (campo[i - 1][j] == 1)
                        viva++;

                    if (campo[i - 1][j - 1] == 1)
                        viva++;

                    if (campo[i][j - 1] == 1)
                        viva++;

                    if (campo[i + 1][j - 1] == 1)
                        viva++;

                    if (campo[i + 1][j] == 1)
                        viva++;

                    if (campo[i + 1][j + 1] == 1)
                        viva++;

                    if (campo[i][j + 1] == 1)
                        viva++;

                    if (campo[i - 1][j + 1] == 1)
                        viva++;

                    if (viva < 2)
                        clone[i][j] = 0;
                    else if (viva > 3)
                        clone[i][j] = 0;
                    if (viva == 3)
                        clone[i][j] = 1;
                }


            for (i = 1; i < lin - 1; i++) {
                for (j = 1; j < col - 1; j++) {
                    result.append(" ").append(campo[i][j]);
                }
                result.append("\n");
            }
            result.append("\n");

            for (i = 1; i < lin - 1; i++) {
                for (j = 1; j < col - 1; j++) {
                    campo[i][j] = clone[i][j];
                }
            }
            --ger;
        }
        return result.toString();
    }

}
