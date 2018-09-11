import Level_Advanced_4.Problem348;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test348 {

    @Test
    void runTest() {

        assertAll(
                () -> assertEquals(20, Problem348.run("XX".toCharArray())),
                () -> assertEquals(21, Problem348.run("XXI".toCharArray())),
                () -> assertEquals(19, Problem348.run("XIX".toCharArray())),
                () -> assertEquals(2, Problem348.run("II".toCharArray())),
                () -> assertEquals(1031, Problem348.run("MXXXI".toCharArray())),
                () -> assertEquals(551, Problem348.run("DLI".toCharArray())),
                () -> assertEquals(1049, Problem348.run("MXLIX".toCharArray())),
                () -> assertEquals(578, Problem348.run("DLXXVIII".toCharArray())),
                () -> assertEquals(128, Problem348.run("CXXVIII".toCharArray())),
                () -> assertEquals(1098, Problem348.run("MXCVIII".toCharArray())),
                () -> assertEquals(1138, Problem348.run("MCXXXVIII".toCharArray())),
                () -> assertEquals(1238, Problem348.run("MCCXXXVIII".toCharArray())),
                () -> assertEquals(798, Problem348.run("DCCXCVIII".toCharArray())),
                () -> assertEquals(1338, Problem348.run("MCCCXXXVIII".toCharArray())),
                () -> assertEquals(1388, Problem348.run("MCCCLXXXVIII".toCharArray())),
                () -> assertEquals(1, Problem348.run("I".toCharArray())),
                () -> assertEquals(2010, Problem348.run("MMX".toCharArray()))
        );

    }

    @Test
    void errorTest() {
        assertAll(
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem348.run("XasdX".toCharArray()),
                        "Não detectou caracter inválido."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem348.run("XxxX".toCharArray()),
                        "Não detectou caracter inválido."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem348.run("XCccX".toCharArray()),
                        "Não detectou caracter inválido."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem348.run("XAX".toCharArray()),
                        "Não detectou caracter inválido."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem348.run("X34X".toCharArray()),
                        "Não detectou caracter inválido."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem348.run("adf".toCharArray()),
                        "Não detectou caracter inválido."),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem348.run("3545".toCharArray()),
                        "Não detectou caracter inválido.")

        );
    }

}
