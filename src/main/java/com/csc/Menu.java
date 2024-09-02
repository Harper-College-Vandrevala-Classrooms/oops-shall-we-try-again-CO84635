package com.csc;

import java.util.Scanner;

public class Menu {

    public static int menuValidIntegerChecker(Integer lower, Integer upper, String prompt, String errorMessage ) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(prompt);

            int input = scanner.nextInt();

            boolean isValid = true;

            if (lower != null && input < lower) {
                isValid = false;
            }
            if (upper != null && input > upper) {
                isValid = false;
            }

            if (isValid) {
                return input;
            } else {
                System.out.println(errorMessage);
            }
        }
    }

    public static void main(String[] args) {
        String prompt = "Please enter a value: ";
        String errorMessage = "Your value is invalid.";

        int result = Menu.menuValidIntegerChecker(null, null, prompt, errorMessage);
        System.out.println("Result with no bounds: " + result);

        result = Menu.menuValidIntegerChecker(null, 100, prompt, errorMessage);
        System.out.println("Result with bounds: " + result);

        result = Menu.menuValidIntegerChecker(0, null, prompt, errorMessage);
        System.out.println("Result with bounds: " + result);

        result = Menu.menuValidIntegerChecker(0, 100, prompt, errorMessage);
        System.out.println("Result with bounds: " + result);

        result = Menu.menuValidIntegerChecker(null, 100, prompt, errorMessage);
        System.out.println("Result with bounds: " + result);

        result = Menu.menuValidIntegerChecker(-100, null, prompt, errorMessage);
        System.out.println("Result with bounds: " + result);

        result = Menu.menuValidIntegerChecker(-100, -50, prompt, errorMessage);
        System.out.println("Result with bounds: " + result);
    }
}
