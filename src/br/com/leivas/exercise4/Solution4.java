package br.com.leivas.exercise4;

import br.com.leivas.ValueNotValidException;

import java.util.Scanner;

public class Solution4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operation = 1;
        while (operation != 2) {
            System.out.println("1- Divisors sum / 2- Leave program\n");
            operation = scanner.nextInt();
            shouldSum(operation);
        }
    }

    public static void shouldSum(int operation) {
        if (operation == 1) {
            try {
                AdvancedArithmetic<Integer> calculator = new MyCalculator();
                System.out.println("Type a number to sum its divisors\n");
                final int value = scanner.nextInt();
                final Integer result = calculator.divisorSum(value);
                System.out.printf("%s Divisors sum is : %s\n", value, result);
            } catch (ValueNotValidException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
