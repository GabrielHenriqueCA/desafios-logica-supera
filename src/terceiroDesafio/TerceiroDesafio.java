package terceiroDesafio;

import java.util.*;

public class TerceiroDesafio {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextInt());
            }

            int count = countPairsWithDifferenceK(arr, k);
            System.out.println(count);
        } catch (Exception e) {
            System.err.println("Erro: Entrada inválida.");
            e.printStackTrace();
        }
    }

    public static int countPairsWithDifferenceK(List<Integer> arr, int k) {
        if (arr.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode estar vazia.");
        }

        Set<Integer> numbers = new HashSet<>();
        int count = 0;

        for (int num : arr) {
            if (numbers.contains(num - k)) {
                count++;
            }
            if (numbers.contains(num + k)) {
                count++;
            }
            numbers.add(num);
        }

        return count;
    }
}