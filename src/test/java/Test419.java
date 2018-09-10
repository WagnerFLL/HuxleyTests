import Level_Advanced_4.Problem419;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test419 {

    @Test
    void runTest() {

        String r0 = "{ 1 }{ }";
        String r1 = "{ 1 2 3 }{ 1 2 }{ 1 3 }{ 1 }{ 2 3 }{ 2 }{ 3 }{ }";
        String r2 = "{ 1 2 3 4 }{ 1 2 3 }{ 1 2 4 }{ 1 2 }{ 1 3 4 }{ 1 3 }{ 1 4 }{ 1 }{ 2 3 4 }{ 2 3 }{ 2 4 }{ 2 }{ 3 4 }{ 3 }{ 4 }{ }";
        String r3 = "{ 1 2 3 4 5 6 }{ 1 2 3 4 5 }{ 1 2 3 4 6 }{ 1 2 3 4 }{ 1 2 3 5 6 }{ 1 2 3 5 }{ 1 2 3 6 }{ 1 2 3 }{ 1 2 4 5 6 }{ 1 2 4 5 }{ 1 2 4 6 }{ 1 2 4 }{ 1 2 5 6 }{ 1 2 5 }{ 1 2 6 }{ 1 2 }{ 1 3 4 5 6 }{ 1 3 4 5 }{ 1 3 4 6 }{ 1 3 4 }{ 1 3 5 6 }{ 1 3 5 }{ 1 3 6 }{ 1 3 }{ 1 4 5 6 }{ 1 4 5 }{ 1 4 6 }{ 1 4 }{ 1 5 6 }{ 1 5 }{ 1 6 }{ 1 }{ 2 3 4 5 6 }{ 2 3 4 5 }{ 2 3 4 6 }{ 2 3 4 }{ 2 3 5 6 }{ 2 3 5 }{ 2 3 6 }{ 2 3 }{ 2 4 5 6 }{ 2 4 5 }{ 2 4 6 }{ 2 4 }{ 2 5 6 }{ 2 5 }{ 2 6 }{ 2 }{ 3 4 5 6 }{ 3 4 5 }{ 3 4 6 }{ 3 4 }{ 3 5 6 }{ 3 5 }{ 3 6 }{ 3 }{ 4 5 6 }{ 4 5 }{ 4 6 }{ 4 }{ 5 6 }{ 5 }{ 6 }{ }";
        assertAll(
                () -> assertEquals(r0, Problem419.run(1)),
                () -> assertEquals(r1, Problem419.run(3)),
                () -> assertEquals(r2, Problem419.run(4)),
                () -> assertEquals(r3, Problem419.run(6))
        );
    }

    @Test
    void errorTest() {

        assertAll(
                () -> assertThrows(java.lang.AssertionError.class, ()-> Problem419.run(-1),
                        "Erro com número negativo aceito."),
                () -> assertThrows(java.lang.AssertionError.class, ()-> Problem419.run(0),
                        "0 aceito incorretamente!"),
                () -> assertThrows(java.lang.AssertionError.class, ()-> Problem419.run(16),
                        "Erro com número maior que o esperado."),
                () -> assertThrows(java.lang.AssertionError.class, ()-> Problem419.run(-1452),
                        "Erro com número negativo aceito."),
                () -> assertThrows(java.lang.NumberFormatException.class, ()-> Problem419.run(Integer.parseInt(null)),
                        "Erro com número inválido.")

        );

    }

}
