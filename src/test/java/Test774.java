import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import q774.q774;

class Test774 {

    @Test
    void runTest1(){

        char[][] map = new char[][]{{'o','o','o',},{'.','.','.'},{'.','.','.'}};
        char[] comands = new char[]{'C','C','D','D','B','B'};
        Assertions.assertEquals("4\n" +
                        ".**\n" +
                        "..*\n" +
                        "..*\n",
                q774.run(map,3, comands));
    }

    @Test
    void runTest2() {

        char[][] map = new char[][]{{'.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'o', '.', '.', 'o', 'o'},
                {'.', '.', '.', 'o', 'o'},
                {'.', '.', 'o', 'o', '.'}};
        char[] comands = new char[]{'D','D','C','C','E','C','D','D','B','B'};
        Assertions.assertEquals("4\n" +
                        ".....\n" +
                        "..**.\n" +
                        "...*.\n" +
                        "...*.\n" +
                        ".....\n",
                q774.run(map,5, comands));
    }

    @Test
    void runTest3() {

        char[][] map = new char[][]{{'o','o','o'},
                {'.','.','.'},
                {'.','.','.'}};
        char[] comands = new char[]{'C','C','D','D','B'};
        Assertions.assertEquals("4\n" +
                        "***\n" +
                        "..*\n" +
                        "...\n",
                q774.run(map,3, comands));
    }

    @Test
    void runTest4() {

        char[][] map = new char[][]{{'o','o','o'},
                {'.','.','.'},
                {'.','.','.'}};
        char[] comands = new char[]{'C','C','D','D','B','E','E'};
        Assertions.assertEquals("4\n" +
                        "..*\n" +
                        "***\n" +
                        "...\n",
                q774.run(map,3, comands));
    }

    @Test
    void runTest5() {

        char[][] map = new char[][]{{'.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'o', '.', '.', 'o', 'o'},
                {'.', '.', '.', 'o', 'o'},
                {'.', '.', 'o', 'o', '.'}};
        char[] comands = new char[]{'D','D','C','C','E','C','C'};
        Assertions.assertEquals("2\n" +
                        ".*...\n" +
                        ".*...\n" +
                        ".....\n" +
                        ".....\n" +
                        ".....\n",
                q774.run(map,5, comands));
    }


}