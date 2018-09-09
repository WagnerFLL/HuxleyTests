package q707;

public class q707 {
    public static String run(int vzs, int n, int vlr, int[] amigos) {

        assert n > 0 && vlr > 0 && amigos != null && amigos.length > 0;

        int i, j, sm;

        for (i = 0; i < n; i++) {
            sm = 0;
            for (j = i; j < n; j++) {
                sm += amigos[j];
                if (sm == vlr)
                    return "YES";
            }

        }

        return "NO";

    }
}