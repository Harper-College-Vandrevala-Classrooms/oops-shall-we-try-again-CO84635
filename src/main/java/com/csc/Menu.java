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
            System.out.print(prompt + " Enter \"exit\" to leave the menu. ");
            String input = scanner.next();

            if (input.equals("exit")) {
                return null;
            }

            if (input.matches("-?\\d+")) {
                int value = Integer.parseInt(input);
                if (isValidInput(lower, upper, value)) {
                    return value;
                } else {
                    System.out.println(errorMessage);
                }
            } else {
                System.out.println(errorMessage);
            }
        }
    }


    public static Integer menuValidIntegerCheckerWithDefault(
            Integer lower, Integer upper, String prompt, String errorMessage, int defaultValue) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt + " Enter \"default\" to use the default value of " + defaultValue + ". Or " +
                    "Enter \"exit\" to leave the menu. ");
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
            } else if (input.matches("-?\\d+")) {
                int value = Integer.parseInt(input);
                if (isValidInput(lower, upper, value)) {
                    return value;
                } else {
                    System.out.println(errorMessage);
                }
            } else {
                System.out.println(errorMessage);
            }
        }
    }

    public static void printResult(Integer result) {
        if (result != null) {
            System.out.println("The value chosen by the user is " + result);
        } else {
            System.out.println("The user has exited the program");
        }
    }

    public static void main(String[] args) {
        String prompt = "Please enter a value.";
        String errorMessage = "Your value is invalid.";

        Integer result;

//      result = Menu.menuValidIntegerChecker(null, null, prompt, errorMessage);
//        printResult(result);

//        result = Menu.menuValidIntegerChecker(null, 100, prompt, errorMessage);
//        printResult(result);
//
//        result = Menu.menuValidIntegerChecker(0, null, prompt, errorMessage);
//        printResult(result);
//
//        result = Menu.menuValidIntegerChecker(0, 100, prompt, errorMessage);
//        printResult(result);
//
//        result = Menu.menuValidIntegerChecker(-100, 100, prompt, errorMessage);
//        printResult(result);
//
        result = Menu.menuValidIntegerChecker(-100, null, prompt, errorMessage);
        printResult(result);
//
//        result = Menu.menuValidIntegerChecker(-100, 0, prompt, errorMessage);
//        printResult(result);
//
//        result = Menu.menuValidIntegerCheckerWithDefault(null, null, prompt, errorMessage, 100);
//        printResult(result);
//
        result = Menu.menuValidIntegerCheckerWithDefault(null, 100, prompt, errorMessage, 100);
        printResult(result);
//
//        result = Menu.menuValidIntegerCheckerWithDefault(0, null, prompt, errorMessage, 100);
//        printResult(result);
//
//        result = Menu.menuValidIntegerCheckerWithDefault(0, 100, prompt, errorMessage, 100);
//        printResult(result);
//
//        result = Menu.menuValidIntegerCheckerWithDefault(-100, 100, prompt, errorMessage, 100);
//        printResult(result);
//
//        result = Menu.menuValidIntegerCheckerWithDefault(-100, null, prompt, errorMessage, 100);
//        printResult(result);
//
//        result = Menu.menuValidIntegerCheckerWithDefault(-100, 0, prompt, errorMessage, -100);
//        printResult(result);
//
//        result = Menu.menuValidIntegerCheckerWithDefault(null, null, prompt, errorMessage, -100);
//        printResult(result);
//
//        result = Menu.menuValidIntegerCheckerWithDefault(null, 100, prompt, errorMessage, -100);
//        printResult(result);
//
//        result = Menu.menuValidIntegerCheckerWithDefault(0, null, prompt, errorMessage, -100);
//        printResult(result);
//
//        result = Menu.menuValidIntegerCheckerWithDefault(0, 100, prompt, errorMessage, -100);
//        printResult(result);
//
//        result = Menu.menuValidIntegerCheckerWithDefault(-100, 100, prompt, errorMessage, -100);
//        printResult(result);
//
//        result = Menu.menuValidIntegerCheckerWithDefault(-100, null, prompt, errorMessage, -100);
//        printResult(result);
//
//        result = Menu.menuValidIntegerCheckerWithDefault(-100, 0, prompt, errorMessage, -100);
//        printResult(result);
    }
}

/*This comment is dedicated to my response to the two credit addons; abort the entry.
To start, when the user decides to exit the program, I believe that the function should indicate that the user did
or didn't abort the program. Primarily that the program provide feedback to the user to indicate that the programming
ending wasn't because of an error but a deliberate closure. This clarity will ensure developers that closing the program
 was intentional and the users that it was their selection.
 */