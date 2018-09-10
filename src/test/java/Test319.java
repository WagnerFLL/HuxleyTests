import Level_Expert_5.Problem319;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Test319 {

    @Test
    void runTest1() {
        int[][] intervals = new int[][]{{1, 3},
                                        {2, 5},
                                        {4, 6}};
        assertEquals(2, Problem319.run(3, intervals),
                "Erro com intervalos contínuos");
    }

    @Test
    void runTest2() {
        int[][] intervals = new int[][]{{1, 4},
                                        {3, 7},
                                        {5, 9},
                                        {6, 11},
                                        {7, 12}};
        assertEquals(2, Problem319.run(5, intervals),
                "Erro ao entrar com intervalos sobrepostos.");
    }

    @Test
    void runTest3() {
        int[][] intervals = new int[][]{{1, 4},
                {6, 11},
                {5, 9},
                {3, 7},
                {7, 12}};
        assertEquals(2, Problem319.run(5, intervals),
                "Erro ao entrar com intervalos desordenados.");
    }

    @Test
    void errorTest() {

        int[][] test = new int[][]{};

        assertAll(
                () -> assertThrows(java.lang.AssertionError.class, ()-> Problem319.run(-1,test),
                        "Assert não parou o programa com n negativo!"),
                () -> assertThrows(java.lang.AssertionError.class, ()-> Problem319.run(4, null),
                        "Assert não parou o programa com interval nulo."),
                () -> assertThrows(java.lang.AssertionError.class, ()-> Problem319.run(3, test),
                        "Assert não parou o programa com interval vazio.")
        );
    }

}
