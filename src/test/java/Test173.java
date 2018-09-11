import Level_Expert_5.Problem173;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test173 {

    @Test
    void runTest() {

        int[][] audit1 = new int[][]{{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        int[][] audit2 = new int[][]{{4, 3}, {2, 1}};
        int[][] audit3 = new int[][]{{2}, {3}, {5}, {1}, {6}, {4}, {7}};

        assertAll(
                () -> assertEquals(0, Problem173.run(3, 4, audit1),
                        "Resultado inesperado para caso onde I < L"),
                () -> assertEquals(2, Problem173.run(2, 2, audit2),
                        "Resultado inesperado para caso onde I = L"),
                () -> assertEquals(5, Problem173.run(7, 1, audit3),
                        "Resultado inesperado para caso onde L = 1.")
        );

    }

    @Test
    void errorTest() {

        int[][] audit1 = new int[][]{{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        int[][] audit2 = new int[][]{{1, 2, 3, 4},
                {},
                {9, 10, 11, 12}};

        assertAll(
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem173.run(-1, 1, audit1),
                        "Erro índice negativo."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem173.run(1000, 1, audit1),
                        "Erro índice maior que o limite."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem173.run(1, -1, audit1),
                        "Erro índice negativo."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem173.run(1, 3311, audit1),
                        "Erro índice maior que o limite."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem173.run(1, 1, new int[][]{}),
                        "Erro array vazio."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem173.run(1, 1, audit2),
                        "Erro array interno vazio."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem173.run(1, 1, null),
                        "Erro valor nulo.")
        );

    }

}
