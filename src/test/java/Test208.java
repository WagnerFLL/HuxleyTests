import Level_Advanced_4.Problem208;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test208 {

    @Test
    void runTest() {
        assertAll(
                () -> assertEquals("S", Problem208.run(634751), "Retorno incorreto!"),
                () -> assertEquals("S", Problem208.run(341233213), "Retorno incorreto!"),
                () -> assertEquals("N", Problem208.run(86028121), "Retorno incorreto!"),
                () -> assertEquals("N", Problem208.run(817504243), "Retorno incorreto!")
        );

    }

    @Test
    void errorTest() {
        assertAll(
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem208.run(-1),
                        "Assert não funciona como esperado."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem208.run(-10),
                        "Assert não funciona como esperado."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem208.run(-123 + 1),
                        "Assert não funciona como esperado."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem208.run(-05),
                        "Assert não funciona como esperado.")
        );

    }

}
