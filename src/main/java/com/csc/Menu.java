package com.csc;

import java.util.Scanner;

public class Menu {
    public static boolean isValidInput(Integer lower, Integer upper, Integer value) {
        if (lower != null && value < lower) return false;
        if (upper != null && value > upper) return false;
        return true;
    }

    public static Integer menuValidIntegerChecker(Integer lower, Integer upper, String prompt, String errorMessage) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(prompt + " Enter \"exit\" to leave the menu: ");
            String input = scanner.next();

            if (input.equals("exit")) {
                return null;
            }

            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (isValidInput(lower, upper, value)) {
                    return value;
                } else {
                    System.out.println(errorMessage);
                }
            } else {
                System.out.println(errorMessage);
                scanner.next();
            }
        }
    }


    public static Integer menuValidIntegerCheckerWithDefault(
            Integer lower, Integer upper, String prompt, String errorMessage, int defaultValue) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt + " Enter \"default\" to use the default value of " + defaultValue + ". Or" +
                    "Enter \"exit\" to leave the menu: ");
            String input = scanner.next();

            if (input.equals("exit")) {
                return null;
            }

            if (input.equals("default")) {
                if (isValidInput(lower, upper, defaultValue)) {
                    return defaultValue;
                } else {
                    System.out.println(errorMessage);
                }
            } else if (scanner.hasNextInt()) {
                int integerInput = scanner.nextInt();
                if (isValidInput(lower, upper, integerInput)) {
                    return integerInput;
                } else {
                    System.out.println(errorMessage);
                }
            } else {
                System.out.println(errorMessage);
                scanner.next();
            }
        }
    }

    public static void printResult(Integer result) {
        if (result != null) {
            System.out.println("Result with no bounds: " + result);
        } else {
            System.out.println("User exited the prompt.");
        }
    }

    public static void main(String[] args) {
        String prompt = "Please enter a value ";
        String errorMessage = "Your value is invalid.";

        Integer result = Menu.menuValidIntegerChecker(null, null, prompt, errorMessage);
        printResult(result);

        result = Menu.menuValidIntegerChecker(null, 100, prompt, errorMessage);
        printResult(result);

        result = Menu.menuValidIntegerChecker(0, null, prompt, errorMessage);
        printResult(result);

        result = Menu.menuValidIntegerChecker(0, 100, prompt, errorMessage);
        printResult(result);

        result = Menu.menuValidIntegerChecker(-100, 100, prompt, errorMessage);
        printResult(result);

        result = Menu.menuValidIntegerChecker(-100, null, prompt, errorMessage);
        printResult(result);

        result = Menu.menuValidIntegerChecker(-100, 0, prompt, errorMessage);
        printResult(result);

        result = Menu.menuValidIntegerCheckerWithDefault(null, null, prompt, errorMessage, 100);
        printResult(result);

        result = Menu.menuValidIntegerCheckerWithDefault(null, 100, prompt, errorMessage, 100);
        printResult(result);

        result = Menu.menuValidIntegerCheckerWithDefault(0, null, prompt, errorMessage, 100);
        printResult(result);

        result = Menu.menuValidIntegerCheckerWithDefault(0, 100, prompt, errorMessage, 100);
        printResult(result);

        result = Menu.menuValidIntegerCheckerWithDefault(-100, 100, prompt, errorMessage, 100);
        printResult(result);

        result = Menu.menuValidIntegerCheckerWithDefault(-100, null, prompt, errorMessage, 100);
        printResult(result);

        result = Menu.menuValidIntegerCheckerWithDefault(-100, 0, prompt, errorMessage, 100);
        printResult(result);
    }
}

