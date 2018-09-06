import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Test319 {

    @Test
    void runTest1() {
        int[][] intervals = new int[][]{{1, 3},
                                        {2, 5},
                                        {4, 6}};
        Assertions.assertEquals(2, q319.q319.run(3, intervals),
                "Erro com intervalos contínuos");
    }

    @Test
    void runTest2() {
        int[][] intervals = new int[][]{{1, 4},
                                        {3, 7},
                                        {5, 9},
                                        {6, 11},
                                        {7, 12}};
        Assertions.assertEquals(2, q319.q319.run(5, intervals),
                "Erro ao entrar com intervalos sobrepostos.");
    }

    @Test
    void runTest3() {
        int[][] intervals = new int[][]{{1, 4},
                {6, 11},
                {5, 9},
                {3, 7},
                {7, 12}};
        Assertions.assertEquals(2, q319.q319.run(5, intervals),
                "Erro ao entrar com intervalos desordenados.");
    }
}
