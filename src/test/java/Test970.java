import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Level_Expert_5.Problem970;

public class Test970 {

    @Test
    void runTest1() {
        Assertions.assertEquals("1 2 3 4\n" +
                        "1 2 3 6\n" +
                        "1 2 3 11\n" +
                        "1 2 10 11\n" +
                        "1 9 10 11\n" +
                        "8 9 10 11\n",
                Problem970.run("RODA A RODA".toCharArray(), "RODA".toCharArray()));
    }

    @Test
    void runTest2() {
        Assertions.assertEquals("1 2 3 5 6\n" +
                        "1 2 3 5 11\n" +
                        "1 2 3 7 11\n",
                Problem970.run("RODA A RODA".toCharArray(), "ROD A".toCharArray()));
    }

    @Test
    void runTest3() {
        Assertions.assertEquals("-1",
                Problem970.run("RODA A RODA".toCharArray(), "Erro".toCharArray()));
    }

    @Test
    void runTest4() {
        Assertions.assertEquals("1 2 3 4 5\n",
                Problem970.run("ARARA".toCharArray(), "ARARA".toCharArray()));
    }

}
