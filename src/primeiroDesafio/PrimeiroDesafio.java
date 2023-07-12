package primeiroDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> pair = new ArrayList<>();
            List<Integer> odd = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String inputUser = scanner.nextLine();
                if (inputUser.isEmpty()) {
                    break;
                }
                int num = Integer.parseInt(inputUser);
                separateNumbers(num, pair, odd);
            }

            sortAndPrint(pair);
            sortAndPrintReverse(odd);
        }
    }

    public static void separateNumbers(int num, List<Integer> pair, List<Integer> odd) {
        if (num % 2 == 0) {
            pair.add(num);
        } else {
            odd.add(num);
        }
    }

    public static void sortAndPrint(List<Integer> numbers) {
        Collections.sort(numbers);
        numbers.forEach(System.out::println);
    }

    public static void sortAndPrintReverse(List<Integer> numbers) {
        numbers.sort(Collections.reverseOrder());
        numbers.forEach(System.out::println);
    }
}