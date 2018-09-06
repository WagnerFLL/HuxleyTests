package q970;

public class q970 {

    private static int inc;
    private static char[] seq;
    private static char[] frase;
    private static int[] vet;
    private static String result;

    private static void bt(int ts, int tf, int p, int pf, int ps) {

        int i;

        if (pf > 2)
            if (vet[pf - 1] < vet[pf - 2])
                return;

        if (pf == tf) {

            for (i = 1; i < tf; i++)
                if (vet[i] < vet[i - 1])
                    return;

            inc = 1;
            for (i = 0; i < tf; i++) {
                result += vet[i];
                if (i != tf - 1)
                    result += " ";
            }
            result += "\n";

        } else if (pf < tf) {

            for (i = ps; i < ts; i++) {
                if (frase[pf] == seq[i]) {
                    vet[pf] = i + 1;
                    bt(ts, tf, p, pf + 1, ps + 1);
                }
            }

        }


    }

    public static String run(char[] seqA, char[] fraseA) {

        result = "";
        inc = 0;
        seq = seqA;
        frase = fraseA;
        vet = new int[frase.length];

        bt(seq.length, frase.length, 0, 0, 0);
        if (inc == 0)
            return "-1";
        return result;
    }

}
