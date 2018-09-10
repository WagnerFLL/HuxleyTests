package Level_Advanced_4;

public class Problem952 {

    public static int run(char[] linha) {

        int i, t = Integer.MAX_VALUE;
        int[] ascii = new int[256];

        ascii['v'] = 0;
        ascii['o'] = 0;
        ascii['u'] = 0;
        ascii['p'] = 0;
        ascii['a'] = 0;
        ascii['s'] = 0;
        ascii['r'] = 0;
        ascii['e'] = 0;
        ascii['m'] = 0;
        ascii['p'] = 0;
        ascii['1'] = 0;

        int l = linha.length;
        for (i = 0; i < l; i++) {
            ascii[linha[i]]++;
        }
        i = 1;
        if (ascii['v'] + ascii['V'] < t)
            t = ascii['v'] + ascii['V'];
        //printf("v > %d\n",t);
        if (ascii['o'] + ascii['O'] < t)
            t = ascii['o'] + ascii['O'];
        //printf("O > %d\n",t);
        if (ascii['u'] + ascii['U'] < t)
            t = ascii['u'] + ascii['U'];
        //printf("U > %d\n",t);
        if ((ascii['p'] + ascii['P']) / 2 < t)
            t = (ascii['p'] + ascii['P']) / 2;
        //printf("P > %d\n",t);
        if ((ascii['a'] + ascii['A']) / 2 < t)
            t = (ascii['a'] + ascii['A']) / 2;
        //printf("A > %d\n",t);
        if ((ascii['s'] + ascii['S']) / 2 < t)
            t = (ascii['s'] + ascii['S']) / 2;
        //printf("S > %d\n",t);
        if (ascii['r'] + ascii['R'] < t)
            t = ascii['r'] + ascii['R'];
        //printf("R > %d\n",t);
        if (ascii['e'] + ascii['E'] < t)
            t = ascii['e'] + ascii['E'];
        //printf("E > %d\n",t);
        if (ascii['m'] + ascii['M'] < t)
            t = ascii['m'] + ascii['M'];
        //printf("M > %d\n",t);
        if (ascii['1'] < t)
            t = ascii['1'];
        //printf("1 > %d\n",t);

        if (ascii['v'] + ascii['V'] == 0)
            i = 0;
        if (ascii['o'] + ascii['O'] == 0)
            i = 0;
        if (ascii['u'] + ascii['U'] == 0)
            i = 0;
        if ((ascii['p'] + ascii['P']) / 2 == 0)
            i = 0;
        if ((ascii['a'] + ascii['A']) / 2 == 0)
            i = 0;
        if ((ascii['s'] + ascii['S']) / 2 == 0)
            i = 0;
        if (ascii['r'] + ascii['R'] == 0)
            i = 0;
        if (ascii['e'] + ascii['E'] == 0)
            i = 0;
        if (ascii['m'] + ascii['M'] == 0)
            i = 0;
        if (ascii['1'] == 0)
            i = 0;

        if (i == 0)
            return 0;

        return t;
    }

}
