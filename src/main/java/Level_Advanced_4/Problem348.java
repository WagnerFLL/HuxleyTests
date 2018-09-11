package Level_Advanced_4;

import java.util.Arrays;

public class Problem348 {

    public static int run(char[] roman) {

        for (char c : roman) {
            assert c == 'I' || c == 'V' || c == 'X' || c == 'C' || c == 'L' || c == 'D' || c == 'M';
        }

        int i, number = 0, aux = 9999999, count = 0;
        int[] values = new int[50];
        Arrays.fill(values, -1);

        for (i = 0; i != roman.length; ++i) {
            if (roman[i] == 'I') values[i] = 1;
            else if (roman[i] == 'V') values[i] = 5;
            else if (roman[i] == 'X') values[i] = 10;
            else if (roman[i] == 'L') values[i] = 50;
            else if (roman[i] == 'C') values[i] = 100;
            else if (roman[i] == 'D') values[i] = 500;
            else if (roman[i] == 'M') values[i] = 1000;
        }

        for (i = 0; i != roman.length; i++) {
            if (aux > values[i]) {
                number += count;
                count = 0;
                count += values[i];
            } else if (aux < values[i]) {
                number += values[i] - count;
                count = 0;
            } else {
                count += values[i];
            }
            aux = values[i];
        }

        number += count;
        return number;
    }

}
