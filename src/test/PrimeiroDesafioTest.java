package test;

import org.junit.Test;
import primeiroDesafio.PrimeiroDesafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class PrimeiroDesafioTest {

    @Test
    public void testSeparateNumbers() {

        List<Integer> numbers = Arrays.asList(4, 10, 32, 34, 543, 3456, 654, 567, 87, 6789, 98);

        List<Integer> listPair = new ArrayList<>();
        List<Integer> listOdd = new ArrayList<>();

        List<Integer> expectedPair = Arrays.asList(4, 10, 32, 34, 3456, 654, 98);
        List<Integer> expectedOdd = Arrays.asList(543, 567, 87, 6789);

        numbers.forEach(num -> PrimeiroDesafio.separateNumbers(num, listPair, listOdd));

        assertEquals(expectedPair.size(), listPair.size());
        assertEquals(expectedOdd.size(), listOdd.size());

        assertEquals(listPair, expectedPair);
        assertEquals(listOdd, expectedOdd);
    }

    @Test
    public void testSortAndPrint() {
        List<Integer> numbersPair = new ArrayList<>(Arrays.asList(4, 10, 32, 34, 3456, 654, 98));
        List<Integer> expectedNumbers = new ArrayList<>(Arrays.asList(4, 10, 32, 34, 98, 654, 3456));

        PrimeiroDesafio.sortAndPrint(numbersPair);

        assertEquals(expectedNumbers, numbersPair);
    }

    @Test
    public void testSortAndPrintReverse() {
        List<Integer> numbersOdd = new ArrayList<>(Arrays.asList(543, 567, 87, 6789));
        List<Integer> expectedNumbers = new ArrayList<>(Arrays.asList(6789, 567, 543, 87));

        PrimeiroDesafio.sortAndPrintReverse(numbersOdd);

        assertEquals(expectedNumbers, numbersOdd);
    }

}