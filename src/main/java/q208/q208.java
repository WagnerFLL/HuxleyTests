package q208;

public class q208 {

    public static String run(long n) {

        assert n > 0;

        int i, aux = 0;

        for (i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                aux = 1;
                break;
            }
        }

        if (aux > 0)
            return "S";
        else
            return "N";
    }
}
