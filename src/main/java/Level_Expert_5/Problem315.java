package Level_Expert_5;

public class Problem315 {

    public static String run(char[] nome) {

        assert nome != null && nome.length > 0 && nome.length < 13;

        int i, a, tam;

        char[] p3 = new char[100];
        char[] p2 = new char[100];
        char[] p1 = new char[100];

        for (i = 0; i < nome.length; i++) {
            if (nome[i] > 70)
                nome[i] = '0';
        }

        tam = nome.length;
        tam /= 3;

        a = 0;
        for (i = 0; i < tam; i++, a++) {
            p1[i] = nome[a];
        }
        p1[2] = '\0';


        for (i = 0; i < tam; i++, a++) {
            p2[i] = nome[a];
        }
        p2[2] = '\0';


        for (i = 0; i < tam; i++, a++) {
            p3[i] = nome[a];
        }
        p3[2] = '\0';

        String p11 = "";
        for (char aa : p1) {
            if (aa != '\0') p11 += aa;
            else break;
        }

        String p22 = "";
        for (char aa : p2) {
            if (aa != '\0') p22 += aa;
            else break;
        }
        String p33 = "";
        for (char aa : p3) {
            if (aa != '\0') p33 += aa;
            else break;
        }


        return String.valueOf(Integer.parseInt(p11, 16)) + " " + String.valueOf(Integer.parseInt(p22, 16)) + " " + String.valueOf(Integer.parseInt(p33, 16));
    }

}
