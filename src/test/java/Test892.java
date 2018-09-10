import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test892 {

    @Test
    void runTest1() {
        char[][] campo = new char[][]{{'.','.','.',},
                                    {'.','&','.',},
                                    {'*','*','*',}};
        char[][] campo2 = new char[][]{{'.','.','.','.',},
                {'.','&','&','.',},
                {'.','.','*','.',},
                {'*','*','*','*',},
                {'.','.','.','.',}};
        char[][] campo3 = new char[][]{{'.','.','.','.',},
                {'.','&','&','.',},
                {'.','.','*','.',},
                {'*','*','*','*',},
                {'.','.','.','.',}};
        assertAll(
                () -> assertEquals("S", q892.q892.run(3,3,campo), "Resposta inesperada!"),
                () -> assertEquals("N", q892.q892.run(5,4,campo2), "Resposta inesperada!"),
                () -> assertEquals("N", q892.q892.run(5,4,campo3), "Resposta inesperada!")
        );
    }

    @Test
    void limitTest() {
        char[][] campo = new char[][]{{'.'}};
        char[][] campo2 = new char[][]{{'.'},{'&'},{'.'},{'&'},{'.'},{'&'},{'.'},{'&'},{'.'}};
        char[][] campo3 = new char[][]{{'.','&','.','&','.','&','.','&','.','&','.','&','.'}};

        assertAll(
                () -> assertEquals("S", q892.q892.run(1,1,campo), "erro com campo no tamanho mínimo!"),
                () -> assertEquals("S",q892.q892.run(9,1, campo2), "erro com o campo com apenas uma coluna!"),
                () -> assertEquals("S",q892.q892.run(1,13, campo3), "erro quando o campo tem apenas uma linha!")
        );

    }

    @Test
    void errorTest() {
        char[][] campo = new char[][]{{'.'}};

        assertAll(
                () -> assertThrows(java.lang.AssertionError.class, ()-> q892.q892.run(-1,1,campo),
                        "erro com parâmetro inválido não detectado!"),
                () -> assertThrows(java.lang.AssertionError.class, ()-> q892.q892.run(1,-1,campo),
                        "erro com parâmetro inválido não detectado!"),
                () -> assertThrows(java.lang.AssertionError.class, ()-> q892.q892.run(1,1,null),
                        "erro com parâmetro inválido não detectado!"),
                () -> assertThrows(java.lang.AssertionError.class, ()-> q892.q892.run(1,1,new char[][]{}),
                        "erro com parâmetro inválido não detectado!")
        );

    }

}
