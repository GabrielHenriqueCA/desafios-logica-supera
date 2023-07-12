package test;

import org.junit.Test;
import quartoDesafio.QuartoDesafio;

import static org.junit.Assert.assertEquals;

public class QuartoDesafioTest {

    @Test
    public void testDecryptLine() {
        String input = """
                5
                I ENIL SIHTHSIREBBIG S
                LEVELKAYAK
                H YPPAHSYADILO
                ABCDEFGHIJKLMNOPQRSTUVWXYZ
                VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE""";


        String expectedOutput = """
                THIS LINE IS GIBBERISH
                LEVELKAYAK
                HAPPY HOLIDAYS
                MLKJIHGFEDCBAZYXWVUTSRQPON
                FRENCH HENS TWO DOVES AND A PARTRIDGE""";


        String[] inputs = input.split("\n");
        String[] expectedOutputs = expectedOutput.split("\n");

        int numCases = Integer.parseInt(inputs[0]);

        for (int i = 0; i < numCases; i++) {
            String originalString = inputs[i + 1];
            String decryptedString = QuartoDesafio.decryptLine(originalString).trim();
            assertEquals(expectedOutputs[i].trim(), decryptedString);
        }
    }


    @Test
    public void testIsNumeric() {
        String numberTest = "5";
        boolean resultExpected = true;

        boolean resultActual = QuartoDesafio.isNumeric(numberTest);

        assertEquals(resultExpected, resultActual);

    }
}
