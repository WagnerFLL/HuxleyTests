import org.junit.jupiter.api.Test;
import Level_Advanced_4.Problem774;

import static org.junit.jupiter.api.Assertions.*;

class Test774 {

    @Test
    void runTest1() {

        char[][] map = new char[][]{{'o', 'o', 'o',}, {'.', '.', '.'}, {'.', '.', '.'}};
        char[] comands = new char[]{'C', 'C', 'D', 'D', 'B', 'B'};
        assertEquals("4\n" +
                        ".**\n" +
                        "..*\n" +
                        "..*\n",
                Problem774.run(map, 3, comands));
    }

    @Test
    void runTest2() {

        char[][] map = new char[][]{{'.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'o', '.', '.', 'o', 'o'},
                {'.', '.', '.', 'o', 'o'},
                {'.', '.', 'o', 'o', '.'}};
        char[] comands = new char[]{'D', 'D', 'C', 'C', 'E', 'C', 'D', 'D', 'B', 'B'};
        assertEquals("4\n" +
                        ".....\n" +
                        "..**.\n" +
                        "...*.\n" +
                        "...*.\n" +
                        ".....\n",
                Problem774.run(map, 5, comands));
    }

    @Test
    void runTest3() {

        char[][] map = new char[][]{{'o', 'o', 'o'},
                {'.', '.', '.'},
                {'.', '.', '.'}};
        char[] comands = new char[]{'C', 'C', 'D', 'D', 'B'};
        assertEquals("4\n" +
                        "***\n" +
                        "..*\n" +
                        "...\n",
                Problem774.run(map, 3, comands));
    }

    @Test
    void runTest4() {

        char[][] map = new char[][]{{'o', 'o', 'o'},
                {'.', '.', '.'},
                {'.', '.', '.'}};
        char[] comands = new char[]{'C', 'C', 'D', 'D', 'B', 'E', 'E'};
        assertEquals("4\n" +
                        "..*\n" +
                        "***\n" +
                        "...\n",
                Problem774.run(map, 3, comands));
    }

    @Test
    void runTest5() {

        char[][] map = new char[][]{{'.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'o', '.', '.', 'o', 'o'},
                {'.', '.', '.', 'o', 'o'},
                {'.', '.', 'o', 'o', '.'}};
        char[] comands = new char[]{'D', 'D', 'C', 'C', 'E', 'C', 'C'};
        assertEquals("2\n" +
                        ".*...\n" +
                        ".*...\n" +
                        ".....\n" +
                        ".....\n" +
                        ".....\n",
                Problem774.run(map, 5, comands));
    }

    @Test
    void errorTest() {
        char[][] map = new char[][]{{' '}};
        char[] comands = new char[]{};
        assertAll(
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem774.run(map, -1, comands),
                        "Erro não capturado para size negativo."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem774.run(null, 1, comands),
                        "Erro não capturado para map null."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem774.run(new char[][]{}, 1, comands),
                        "Erro não capturado para map vazio"),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem774.run(map, 1, null),
                        "Erro não capturado para comands nulo")
        );
    }

}