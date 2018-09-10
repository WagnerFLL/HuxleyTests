import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Test284 {

    @Test
    void runTest() {
        assertAll(
                () -> assertEquals(25,q284.q284.run(10), "Erro com 10 iterações."),
                () -> assertEquals(79,q284.q284.run(63), "Erro com 10 iterações."),
                () -> assertEquals(-1,q284.q284.run(72763), "Erro com valor que não deveria ser encontrado."),
                () -> assertEquals(-1,q284.q284.run(10001), "Erro com valor que não deveria ser encontrado."),
                () -> assertEquals(-1,q284.q284.run(22), "Erro com valor que não deveria ser encontrado."),
                () -> assertEquals(6789,q284.q284.run(3024), "Erro em caso de mais de 50 iterações."),
                () -> assertEquals(29999,q284.q284.run(13122), "Erro em caso de mais de 180 iterações."),
                () -> assertEquals(99999,q284.q284.run(59049), "Erro em caso de mais de 500 iterações.")
        );
    }

    @Test
    void errorTest() {
        assertAll(
                () -> assertThrows(java.lang.AssertionError.class, () -> q284.q284.run(-1),
                        "Número negativo capturado."),
                () -> assertThrows(java.lang.AssertionError.class, () -> q284.q284.run(-193412),
                        "Número negativo capturado."),
                () -> assertThrows(java.lang.AssertionError.class, () -> q284.q284.run(0),
                        "0 capturado."),
                () -> assertThrows(java.lang.NumberFormatException.class, () -> q284.q284.run(Long.parseLong(null)),
                        "valor inesperado aceito.")
        );
    }

}
