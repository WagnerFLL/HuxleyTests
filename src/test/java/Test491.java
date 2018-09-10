import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test491 {

    @Test
    void runTest() {

        int[][] sequence1 = new int[][]{
                {3, 50},
                {4, 20},
                {5, 15},
                {2, 30},
                {2, 20}
        };

        int[][] sequence2 = new int[][]{
                {4, 0},
                {3, 25},
                {2, 35},
                {2, 0},
                {3, 0}
        };

        assertAll(
                () -> assertEquals("0 18 15", q491.q491.run(sequence1)),
                () -> assertEquals("0 15 0", q491.q491.run(sequence2))
        );

    }

    @Test
    void errorTest() {
        int[][] sequence = new int[][]{};
        int[][] sequence2 = new int[][]{{1,5},{1,6},{1},{1,4},{11,5}};

        assertAll(
                () -> assertThrows(java.lang.AssertionError.class, () -> q491.q491.run(sequence),
                        "Entrada aceita com tamanho incorreto."),
                () -> assertThrows(java.lang.AssertionError.class, () -> q491.q491.run(sequence2),
                        "Entrada aceita com tamanho incorreto."),
                () -> assertThrows(java.lang.AssertionError.class, () -> q491.q491.run(null),
                        "Entrada nula aceita.")
        );

    }

}
