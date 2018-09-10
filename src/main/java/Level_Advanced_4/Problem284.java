package Level_Advanced_4;

import static java.lang.Math.sqrt;

public class Problem284 {

    public static long run(long n) {

        assert n > 0;

        long i, c = 0, m = 0, ink = 0, m2, l = 1;

        String value = "";
        String nc = "";

        if (n < 81)
            c = n + 11;

        for (i = 2; i < sqrt(n); i++) {
            if (n % i == 0) {
                l = 0;
                break;
            }
        }
        if (l == 1 && n != 2) {
            return -1;
        }
        if (n < 11000) {
            while (m != n && c < 100000) {

                m = 1;
                nc = String.valueOf(c);
                for (i = 0; i < nc.length(); i++) {
                    m *= (int) nc.charAt((int) i) - 48;
                }
                c++;
            }
            if (c == 100000) {
                return -1;
            }
            value += Integer.valueOf(nc);
        } else {

            for (i = n + 11; i < 100000; i++) {
                c = i;
                do {
                    m = c / 10;
                    m2 = c % 10;
                    l *= m2;
                    c = m;
                } while (m != 0);

                if (l == n) {
                    ink = 1;
                    break;
                } else {
                    l = 1;
                }
            }

            if (ink == 1) {
                value += i;
            }

        }

        return Long.parseLong(value);
    }

}
