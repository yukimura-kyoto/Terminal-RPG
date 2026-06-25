package util.ui;

import java.util.Scanner;

public class Input {

    private static final Scanner sc = new Scanner(System.in);

    public static String nextString() {
        return sc.nextLine().trim();
    }

    public static int nextInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number! Try again:");
            }
        }
    }

    public static double nextDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid decimal number! Try again:");
            }
        }
    }

    public static boolean nextBoolean() {
        while (true) {
            String input = sc.nextLine().trim().toLowerCase();

            if (input.equals("true") || input.equals("yes") || input.equals("y")) {
                return true;
            }

            if (input.equals("false") || input.equals("no") || input.equals("n")) {
                return false;
            }

            System.out.println("Type yes/no or true/false:");
        }
    }

    public static String nextString(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static int nextInt(String message) {
        System.out.print(message);
        return Integer.parseInt(sc.nextLine());
    }
}