import Level_Expert_5.Problem315;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test315 {

    @Test
    void runTest() {

        assertAll(
                () -> assertEquals("192 192 0", Problem315.run("CHUCKNORRIS".toCharArray()),
                        "Erro com o último campo inválido."),
                () -> assertEquals("160 218 13", Problem315.run("ASDASD".toCharArray()),
                        "Erro com todos os campos válidos."),
                () -> assertEquals("160 239 0", Problem315.run("AJEFSVA".toCharArray()),
                        "Erro com todos os campos válidos."),
                () -> assertEquals("160 218 189", Problem315.run("AVDABD".toCharArray()),
                        "Erro com todos os campos válidos."),
                () -> assertEquals("0 0 0", Problem315.run("MNMXMJF".toCharArray()),
                        "Erro quando somente a última letra é válida."),
                () -> assertEquals("0 160 0", Problem315.run("KMASHO#".toCharArray()),
                        "Erro com caractere especial.")
        );

    }

    @Test
    void errorTest() {

        assertAll(
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem315.run("".toCharArray()),
                        "Erro ao reconhecer array vazio,"),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem315.run(null),
                        "Erro ao reconhecer array nulo,"),
                () -> assertThrows(java.lang.AssertionError.class, () -> Problem315.run("ADGSKHGSKDKHSADKJH".toCharArray()),
                        "Erro ao reconhecer array maior que o esperado.")
        );

    }

}
