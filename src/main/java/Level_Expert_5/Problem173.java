package Level_Expert_5;

public class Problem173 {

    public static int run(int tam1, int tam2, int[][] auditorio) {

        assert tam1 > 0 && tam1 < 200 && tam2 > 0 && tam2 < 200 && auditorio != null && auditorio.length > 0;
        for (int[] a:auditorio) {
            assert a.length > 0;
        }

        int c1, c2, resul = 0;
        int[] vi = new int[50];
        int[] vj = new int[50];
        int[] aux = new int[50];


        c2 = 0;
        while (c2 < tam2) {
            vj[c2] = (auditorio[0][c2] - 1) % tam2;
            aux[c2] = 0;
            c2++;
        }

        c1 = 0;
        resul = getResul(tam2, c1, resul, vj, aux);

        c2 = 0;
        while (c2 < tam1) {
            vi[c2] = (auditorio[c2][0] - 1) / tam2;
            aux[c2] = 0;
            c2++;
        }

        c1 = 0;
        resul = getResul(tam1, c1, resul, vi, aux);

        return resul;
    }

    private static int getResul(int tam1, int c1, int resul, int[] vi, int[] aux) {
        int t;
        while (c1 < tam1) {
            if (aux[c1] != 1) {
                t = vi[c1];
                while (t != c1) {
                    resul++;
                    aux[t] = 1;
                    t = vi[t];
                }
            }
            c1++;
        }
        return resul;
    }

}
