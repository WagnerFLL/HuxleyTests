import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test951 {

    @Test
    void runTest1() {

        char[][] map = new char[][]{{'-','-','-','-'},
                                    {'-','-','-','-'},
                                    {'-','-','-','-'},
                                    {'-','-','-','*'}};
        Assertions.assertEquals("440",q951.q951.run(4, map));

    }

    @Test
    void runTest2() {

        char[][] map = new char[][]{{'*'}};
        Assertions.assertEquals("0",q951.q951.run(1, map));

    }

    @Test
    void runTest3() {

        char[][] map = new char[][]{{'-','-','-','-'},
                                    {'-','*','-','-'},
                                    {'-','-','-','-'},
                                    {'-','-','-','-'}};
        Assertions.assertEquals("240",q951.q951.run(4, map));

    }

    @Test
    void runTest4() {

        char[][] map = new char[][]{{'-','-','-','-','-','-','-','*','*','*','*','*'},
                                    {'-','-','-','-','*','*','*','*','*','-','-','-'},
                                    {'-','-','-','*','-','-','-','-','*','*','*','-'},
                                    {'-','-','-','*','-','-','-','-','-','-','-','-'},
                                    {'-','-','-','-','-','-','*','*','*','*','*','*'},
                                    {'-','-','-','*','*','*','-','*','*','-','-','*'},
                                    {'-','-','*','*','*','-','-','-','-','-','-','-'},
                                    {'-','-','-','*','-','-','-','-','-','-','-','-'},
                                    {'-','-','-','-','-','-','*','*','*','*','*','-'},
                                    {'-','*','*','*','-','-','-','-','-','-','-','-'},
                                    {'-','-','-','-','-','*','*','*','*','*','-','-'},
                                    {'-','-','-','*','-','-','*','*','*','-','-','-'}};
        Assertions.assertEquals("4240",q951.q951.run(12, map));
    }

    @Test
    void runTest5() {

        char[][] map = new char[][]{{'-','-','-','*'},
                {'-','-','-','-'},
                {'-','-','-','-'},
                {'-','-','-','-'}};
        Assertions.assertEquals("110",q951.q951.run(4, map));

    }

    @Test
    void errorTest() {
        char[][] map = new char[][]{{' '}};
        assertAll(
                () -> assertThrows(java.lang.AssertionError.class, () -> q951.q951.run(-1, map),
                        "Assert não capturou valor negativo."),
                () -> assertThrows(java.lang.AssertionError.class, () -> q951.q951.run(1, null),
                        "Assert não capturou valor nulo.")
        );

    }

}
