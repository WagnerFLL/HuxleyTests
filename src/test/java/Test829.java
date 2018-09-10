import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test829 {

    @Test
    void runTest() {
        char[] sequece1 = new char[]{'a','b','c','d','e'};
        char[] sequece2 = new char[]{'a','b','f','h','z'};
        char[] sequece3 = new char[]{'a','b','b','e','e'};
        char[] sequece4 = new char[]{'z','k','j','d','r'};

        assertAll(
                () -> assertEquals("sim", q829.q829.run(sequece1),
                        "Erro em analizar sequencia continua."),
                () -> assertEquals("nao", q829.q829.run(sequece2),
                        "Erro em analizar sequencia não contíunua mas ordenada."),
                () -> assertEquals("nao", q829.q829.run(sequece3),"" +
                        "Erro ao detectar caracteres repetidos."),
                () -> assertEquals("nao", q829.q829.run(sequece4),
                        "Erro em caracteres fora de ordem.")
        );
    }

    @Test
    void errorTest() {
        char[] sequece = new char[]{'a'};
        assertAll(
                () -> assertThrows(java.lang.AssertionError.class, ()-> q829.q829.run(sequece),
                        "Erro ao tratar sequencia de caracteres com tamanho inválido."),
                () -> assertThrows(java.lang.AssertionError.class, ()-> q829.q829.run(null),
                        "Erro ao tratar sequencia de caracteres nula.")
        );
    }

}
