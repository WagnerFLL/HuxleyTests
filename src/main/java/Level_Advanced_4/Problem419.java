package Level_Advanced_4;

public class Problem419 {

    private static int[] array;
    private static String value;

    private static void show(int n){
        int i;
        value += "{";
        for(i=1 ; i<n+1 ; i++){
            if(array[i]==1){
                value += " " + i;
            }
        }
        value += " }";

    }

    private static void comb(int qtd, int p){
        int i;
        if(p==qtd){
            show(qtd);
        }else{
            p++;

            for(i=1 ; i>=0 ; i--){
                array[p]=i;
                comb(qtd,p);
            }
        }
    }

    public static String run(int n){

        assert n > 0 && n < 16;

        value = "";

        array = new int[n+1];

        comb(n,0);

        return value;
    }

}
