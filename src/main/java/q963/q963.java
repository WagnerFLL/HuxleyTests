package q963;

public class q963 {

    public static String run(int n, int p1, int p2, double[][] matriz) {
        String result = "";
        result += String.format("%.2f ", matriz[p1-1][p1-1]);
        result += String.format("%.2f ", matriz[p1-1][p2-1]);
        result += String.format("%.2f ", matriz[p2-1][p1-1]);
        result += String.format("%.2f", matriz[p2-1][p2-1]);

        return result;
    }

}