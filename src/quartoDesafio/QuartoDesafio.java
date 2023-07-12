package quartoDesafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuartoDesafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> text = new ArrayList<>();

        try {
            while (scanner.hasNextLine()) {
                String inputUser = scanner.nextLine();

                if (isNumeric(inputUser)) {
                    continue;
                }

                if (inputUser.isEmpty()) {
                    break;
                }

                text.add(inputUser);
            }

            for (String inputLine : text) {
                String originalLine = decryptLine(inputLine);
                System.out.println(originalLine);
            }

        } finally {
            scanner.close();
        }
    }

    public static String decryptLine(String line) {
        int length = line.length();
        StringBuilder originalLine = new StringBuilder(length);

        for (int i = length / 2 - 1; i >= 0; i--) {
            originalLine.append(line.charAt(i));
        }

        for (int i = length - 1; i >= length / 2; i--) {
            originalLine.append(line.charAt(i));
        }

        return originalLine.toString();
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}