import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test208 {

    @Test
    void runTest1() {
        Assertions.assertEquals("S", q208.q208.run(634751));
    }

    @Test
    void runTest2() {
        Assertions.assertEquals("S", q208.q208.run(341233213));
    }

    @Test
    void runTest3() {
        Assertions.assertEquals("N", q208.q208.run(86028121));
    }

    @Test
    void runTest4() {
        Assertions.assertEquals("N", q208.q208.run(817504243));
    }

}
