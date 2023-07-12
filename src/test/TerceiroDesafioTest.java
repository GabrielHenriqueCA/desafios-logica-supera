package test;

import org.junit.Test;
import terceiroDesafio.TerceiroDesafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TerceiroDesafioTest {


    @Test
    public void testCountPairsWithDifferenceK() {
        int expectedResult = 3;
        int k = 1;
        List<Integer> listNumbers = new ArrayList<>(Arrays.asList(1,2,3,4));
        int resultActual = TerceiroDesafio.countPairsWithDifferenceK(listNumbers, k);

        assertEquals(expectedResult, resultActual);

    }
}
