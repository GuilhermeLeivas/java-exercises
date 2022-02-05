package br.com.leivas.exercise5;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Solution5 {

    static ICalculator<Integer, Integer> calculator = new Calculator();

    public static void main(String[] args) {
        Integer operation = 1;
        Scanner scanner = new Scanner(System.in);
        while (operation != 2) {
            System.out.println("Type your choice 1- new Operation / 2- Leave program\n");
            operation = scanner.nextInt();
            tryOperation(operation);
        }
    }

    public static void tryOperation(Integer operation) {
        if (operation == 1) {
            Scanner scanner = new Scanner(System.in);
            try {
                calculator.printAvailableOperations();
                final String calculation = scanner.nextLine();
                final Method method = calculator.getClass().getMethod(calculation, Integer.class, Integer.class);
                final Integer[] values = getValues();
                final Object result = method.invoke(calculator, values[0], values[1]);
                System.out.println("The operation result: " + result);
            } catch (Exception ex) {
                System.out.println(new MensagemErro(ex));
            }
        }
    }

    public static Integer[] getValues() {
        Scanner scanner = new Scanner(System.in);
        Integer[] values = new Integer[2];
        System.out.println("Type the first value\n");
        values[0] = Integer.parseInt(scanner.nextLine());
        System.out.println("Type the second value\n");
        values[1] = Integer.parseInt(scanner.nextLine());
        return values;
    }
}
