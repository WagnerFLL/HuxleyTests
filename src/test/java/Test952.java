import Level_Advanced_4.Problem952;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Test952 {

    @Test
    void runTest1() {
        Assertions.assertEquals(1, Problem952.run("vOuPassArEmp1".toCharArray()));
    }

    @Test
    void runTest2() {
        String frase = "vOuPassArEmp1vOuPassArEmp1vOuPassArEmp1v" +
                "OuPassArEmp1vOuPassArEmp1vOuPassArEmp1" +
                "vOuPassArEmp1vOuPassArEmp1vOuPassArEmp" +
                "1vOuPassArEmp1vOuPassArEmp1vOuPassArEmp1" +
                "vOuPassArEmp1";
        Assertions.assertEquals(13, Problem952.run(frase.toCharArray()));
    }

    @Test
    void runTest3() {
        String frase = "Vou Perder P1";
        Assertions.assertEquals(0, Problem952.run(frase.toCharArray()));
    }

    @Test
    void runTest4() {
        String frase = "VvVvvvvvVVVVVVVVVVVvvvvvvccvvVVVv" +
                "OooooooooooooooOoooOOoOOOO" +
                "UuuuUUUuUUUUuUUUUUUuUU" +
                "PpPpPPpPpPPppPppppPp" +
                "AAaAAAaaaAAaaaaAAA" +
                "SSsSSSSSSSSSSSSSS" +
                "RrRrrRR" +
                "EEEEE" +
                "Mmmm" +
                "11";
        Assertions.assertEquals(2, Problem952.run(frase.toCharArray()));
    }

    @Test
    void runTest5() {
        String frase = "";
        Assertions.assertEquals(0, Problem952.run(frase.toCharArray()));
    }
}
