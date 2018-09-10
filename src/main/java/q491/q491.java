package q491;

public class q491 {

    public static String run(int[][] musics) {

        assert musics != null && musics.length == 5;
        for (int [] a: musics) {
            assert a.length == 2;
        }

        int min = 0, hr = 0, seg = 0, enter, i;

        for (i = 0; i < 5; i++) {
            enter = musics[i][0];
            min += enter;
            enter = musics[i][1];
            seg += enter;
        }

        min += seg / 60;
        seg = seg % 60;
        hr += min / 60;
        min = min % 60;

        return hr + " " + min + " " + seg;
    }

}
