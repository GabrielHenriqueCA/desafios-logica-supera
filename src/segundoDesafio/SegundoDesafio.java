package segundoDesafio;

import java.util.Scanner;

public class SegundoDesafio {
    private static final int[] NOTES = {10000, 5000, 2000, 1000, 500, 200};
    private static final int[] COINS = {100, 50, 25, 10, 5, 1};

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double inputUser = scanner.nextDouble();

            printCurrency(inputUser);
        }
    }


    public static void printCurrency(double value) {
        int totalCents = (int) Math.round(value * 100);

        System.out.println("NOTAS:");
        for (int note : NOTES) {
            int quantityNotes = totalCents / note;
            totalCents %= note;
            double noteValue = note / 100.0;
            String noteString = String.format("%d nota(s) de R$ %.2f", quantityNotes, noteValue);
            String sanitizedNoteString = noteString.replace(",", ".");

            System.out.println(sanitizedNoteString);
        }

        System.out.println("MOEDAS:");
        for (int coin : COINS) {
            int quantityCoins = totalCents / coin;
            totalCents %= coin;
            double coinValue = coin / 100.0;
            String coinString = String.format("%d moeda(s) de R$ %.2f", quantityCoins, coinValue);
            String sanitizedCoinString = coinString.replace(",", ".");

            System.out.println(sanitizedCoinString);
        }
    }
}