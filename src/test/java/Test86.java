import Level_Expert_5.Problem86;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test86 {

    @Test
    void runTest() {

        String[] data1 = {
                "AACATGAAGG",
                "TTTTGGCCAA",
                "TTTGGCCAAA",
                "GATCAGATTT",
                "CCCGGGGGGA",
                "ATCGATGCAT"};
        String[] data2 = {
                "CCCGGGGGGA",
                "TTTTGGCCAA",
                "AACATGAAGG",
                "TTTGGCCAAA",
                "ATCGATGCAT",
                "AACATGAAGG",
                "GATCAGATTT"
        };

        String[] data3 = {"A"};

        assertEquals("CCCGGGGGGA AACATGAAGG GATCAGATTT ATCGATGCAT TTTTGGCCAA TTTGGCCAAA ", Problem86.run(10, 6, data1));
        assertEquals("CCCGGGGGGA AACATGAAGG AACATGAAGG GATCAGATTT ATCGATGCAT TTTTGGCCAA TTTGGCCAAA ", Problem86.run(10, 7, data2));
        assertEquals("A ", Problem86.run(1, 1, data3));
    }

    @Test
    void errorTest() {

        String[] data = {"A"};

        assertAll(
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem86.run(-1, 1, data),
                        "Número negativo aceito indevidamente."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem86.run(1002, 1, data),
                        "Número muito grande."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem86.run(10, -2, data),
                        "Valor negativo aceito ilegalmente."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem86.run(1, 120, data),
                        "Valor aceito ilegalmente."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem86.run(1, 1, null),
                        "Data null aceita."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem86.run(1, 1, new String[]{}),
                        "Data vazia aceita.")
        );
    }


}
