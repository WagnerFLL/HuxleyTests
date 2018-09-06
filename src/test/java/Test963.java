import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test963 {

    @Test
    void runTest1() {
        double[][] matriz = new double[][]{{0.0740, 0.6207, 0.8711, 0.8324, 0.4226},
                                            {0.6841, 0.1544, 0.3508, 0.5975, 0.3596},
                                            {0.4024, 0.3813, 0.6855, 0.3353, 0.5583},
                                            {0.9828, 0.1611, 0.2941, 0.2992, 0.7425},
                                            {0.4022, 0.7581, 0.5306, 0.4526, 0.4243}};

        Assertions.assertEquals("0,15 0,60 0,16 0,30", q963.q963.run(5,2,4, matriz));
    }

    @Test
    void runTest2() {
        double[][] matriz = new double[][]{{1,2,3,4},
                                            {5,6,7,8},
                                            {9,10,11,12},
                                            {13,14,15,16}};
        Assertions.assertEquals("1,00 3,00 9,00 11,00", q963.q963.run(4, 1, 3, matriz));
    }

}
