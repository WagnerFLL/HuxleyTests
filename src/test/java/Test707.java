import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test707 {

    @Test
    void runTest1() {
        int[] amigos = new int[]{1,3,4,5,2};
        Assertions.assertEquals("YES", q707.q707.run(1, 5, 12, amigos));
    }

    @Test
    void runTest2() {
        int[] amigos = new int[]{1,3,3,7,3,2};
        Assertions.assertEquals("YES", q707.q707.run(1, 6, 12, amigos));
    }

    @Test
    void runTest3() {
        int[] amigos = new int[]{1,213,3,34,3,5,7,12,3,2};
        Assertions.assertEquals("NO", q707.q707.run(1, 10, 21, amigos));
    }

}
