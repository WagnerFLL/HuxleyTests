import Level_Advanced_4.Problem707;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test707 {

    @Test
    void runTest1() {
        int[] amigos = new int[]{1,3,4,5,2};
        int[] amigos2 = new int[]{1,3,3,7,3,2};
        int[] amigos3 = new int[]{1,213,3,34,3,5,7,12,3,2};
        assertAll(
                () -> assertEquals("YES", Problem707.run(1, 5, 12, amigos), "Retorno incorreto!"),
                () -> assertEquals("YES", Problem707.run(1, 6, 12, amigos2), "Retorno incorreto!"),
                () -> assertEquals("NO", Problem707.run(1, 10, 21, amigos3), "Retorno inesperado!")
        );
    }

    @Test
    void errorTest() {
        int[] test = new int[]{0};
        assertAll(
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem707.run(1, -1, 1 , test),
                        "Assert não capturou n negativo"),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem707.run(1, 1, -1, test),
                        "Assert não capturou vlr negativo"),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem707.run(1,1,1, null),
                        "Assert não capturou array nulo"),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem707.run(1,1,1, new int[]{}),
                        "Assert não capturou array vazio")
        );
    }

}
