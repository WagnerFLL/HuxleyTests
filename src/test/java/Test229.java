import Level_Expert_5.Problem229;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test229 {

    @Test
    void runTest1() {
        String expect = " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 1 1 1 0\n" +
                " 0 0 0 0 1 1 1 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                "\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 1 0 0\n" +
                " 0 0 0 0 1 0 0 1 0\n" +
                " 0 0 0 0 1 0 0 1 0\n" +
                " 0 0 0 0 0 1 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                "\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 1 1 1 0\n" +
                " 0 0 0 0 1 1 1 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                "\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 1 0 0\n" +
                " 0 0 0 0 1 0 0 1 0\n" +
                " 0 0 0 0 1 0 0 1 0\n" +
                " 0 0 0 0 0 1 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                "\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 1 1 1 0\n" +
                " 0 0 0 0 1 1 1 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                "\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 1 0 0\n" +
                " 0 0 0 0 1 0 0 1 0\n" +
                " 0 0 0 0 1 0 0 1 0\n" +
                " 0 0 0 0 0 1 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                "\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 1 1 1 0\n" +
                " 0 0 0 0 1 1 1 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                "\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 1 0 0\n" +
                " 0 0 0 0 1 0 0 1 0\n" +
                " 0 0 0 0 1 0 0 1 0\n" +
                " 0 0 0 0 0 1 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                "\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 1 1 1 0\n" +
                " 0 0 0 0 1 1 1 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                "\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 1 0 0\n" +
                " 0 0 0 0 1 0 0 1 0\n" +
                " 0 0 0 0 1 0 0 1 0\n" +
                " 0 0 0 0 0 1 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                "\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 1 1 1 0\n" +
                " 0 0 0 0 1 1 1 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                "\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 1 0 0\n" +
                " 0 0 0 0 1 0 0 1 0\n" +
                " 0 0 0 0 1 0 0 1 0\n" +
                " 0 0 0 0 0 1 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                "\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 1 1 1 0\n" +
                " 0 0 0 0 1 1 1 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                "\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 1 0 0\n" +
                " 0 0 0 0 1 0 0 1 0\n" +
                " 0 0 0 0 1 0 0 1 0\n" +
                " 0 0 0 0 0 1 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                "\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 1 1 1 0\n" +
                " 0 0 0 0 1 1 1 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                "\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n" +
                " 0 0 0 0 0 0 1 0 0\n" +
                " 0 0 0 0 1 0 0 1 0\n" +
                " 0 0 0 0 1 0 0 1 0\n" +
                " 0 0 0 0 0 1 0 0 0\n" +
                " 0 0 0 0 0 0 0 0 0\n\n";
        int[][] positions = new int[][]{{5, 5},
                {5, 6},
                {5, 7},
                {6, 4},
                {6, 5},
                {6, 6}};

        assertEquals(expect, Problem229.run(9, 9, 6, 15, positions), "Retorno incorreto!");
    }

    @Test
    void errorTest() {
        int[][] test = new int[][]{{0}};
        assertAll(
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem229.run(-1, 1, 1, 1, test),
                        "Erro não detectado!"),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem229.run(1, -1, 1, 1, test),
                        "Erro não detectado!"),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem229.run(1, 1, -1, 1, test),
                        "Erro não detectado!"),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem229.run(1, 1, 1, -1, test),
                        "Erro não detectado!"),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem229.run(1, 1, 1, 1, null),
                        "Erro não detectado!")
        );
    }

}
