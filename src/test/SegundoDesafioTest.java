package test;

import org.junit.Assert;
import org.junit.Test;
import segundoDesafio.SegundoDesafio;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SegundoDesafioTest {

    @Test
    public void testPrintCurrency() {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        double input = 576.73;
        String expectedOutput = """
                NOTAS:
                5 nota(s) de R$ 100.00
                1 nota(s) de R$ 50.00
                1 nota(s) de R$ 20.00
                0 nota(s) de R$ 10.00
                1 nota(s) de R$ 5.00
                0 nota(s) de R$ 2.00
                MOEDAS:
                1 moeda(s) de R$ 1.00
                1 moeda(s) de R$ 0.50
                0 moeda(s) de R$ 0.25
                2 moeda(s) de R$ 0.10
                0 moeda(s) de R$ 0.05
                3 moeda(s) de R$ 0.01
                """.stripIndent();


        String[] expectedOutputs = expectedOutput.split("\n");


        SegundoDesafio.printCurrency(input);

        String actualOutput = out.toString();

        String[] actualLines = actualOutput.split("\n");

        Assert.assertEquals(expectedOutputs.length, actualLines.length);

        for (int i = 0; i < expectedOutputs.length; i++) {
            Assert.assertEquals(expectedOutputs[i].strip(), actualLines[i].strip());
        }
    }
}
