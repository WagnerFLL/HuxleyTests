package Level_Advanced_4;

public class Problem774 {

    public static String run(char[][] map, int sizeM, char[] comand ){

        assert map != null && map.length > 0 && sizeM > 0 && comand != null;

        int sizeC = comand.length;
        int pi = sizeM-1, pj = 0, food = 0, bodySize = 0;

        for (int i = 0; i < sizeC; i++){
            if (comand[i] == 'C')
                pi--;
            else if (comand[i] == 'B')
                pi++;
            else if (comand[i] == 'D')
                pj++;
            else if (comand[i] == 'E')
                pj--;
            if (map[pi][pj] == 'o'){
                food++;
                map[pi][pj] = '.';
            }
        }

        map[pi][pj] = '*';

        sizeC--;
        while(food>0){

            if(comand[sizeC]=='C')
                pi++;
            else if(comand[sizeC]=='B')
                pi--;
            else if(comand[sizeC]=='D')
                pj--;
            else if(comand[sizeC]=='E')
                pj++;

            sizeC--;
            food--;
            map[pi][pj]='*';
        }

        for (int i = 0; i < sizeM; i++){
            for(int j = 0; j < sizeM ; j++){
                if(map[i][j]=='o')
                    map[i][j]='.';
                else if(map[i][j]=='*')
                    bodySize++;
            }
        }

        StringBuilder result = new StringBuilder(String.valueOf(bodySize) + '\n');
        for(int i = 0; i < sizeM; i++){
            for(int j = 0; j < sizeM; j++){
                result.append(map[i][j]);
            }
            result.append('\n');
        }

        return result.toString();
    }

}