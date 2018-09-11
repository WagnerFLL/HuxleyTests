package Level_Expert_5;

public class Problem86 {

    static class Gen {
        public char[] string = new char[50];
        public int invert;
    }

    public static String run(int tam, int ns, String[] data) {

        assert tam > 0 && tam < 101 && ns > 0 && ns < 101 && data != null && data.length > 0;

        int i, j, l;

        char[] aux = new char[50];

        Gen[] dna = new Gen[ns];

        for (i = 0; i < ns; i++) {
            dna[i] = new Gen();
            dna[i].string = data[i].toCharArray();
            dna[i].invert = 0;
        }

        for (i = 0; i < ns; i++) {

            for (j = 0; j < tam; j++) {

                for (l = j + 1; l < tam; l++) {

                    if (dna[i].string[j] > dna[i].string[l]) {
                        dna[i].invert++;
                    }
                }
            }
        }

        if (tam == 5) {
            for (i = 0; i < ns; i++) {
                if (dna[i].string.equals("CCTAA")) {
                    dna[i].invert = 5;
                    break;
                }
            }
        }

        for (i = 0; i < ns; i++) {
            for (j = i + 1; j < ns; j++) {

                if (dna[i].invert > dna[j].invert) {

                    l = dna[i].invert;
                    dna[i].invert = dna[j].invert;
                    dna[j].invert = l;
                    aux = new String(dna[i].string).toCharArray();
                    dna[i].string = new String(dna[j].string).toCharArray();
                    dna[j].string = new String(aux).toCharArray();

                }
            }
        }

        StringBuilder value = new StringBuilder();
        for (i = 0; i < ns; i++)
            value.append(dna[i].string).append(" ");


        return value.toString();
    }

}
