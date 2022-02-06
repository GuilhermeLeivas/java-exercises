package br.com.leivas.exercise10;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public record OperationUtil(List<Integer> list) {

    public void OnListOperation() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Type the operation you want: \n");
        System.out.println("-add\n-remove\n");
        final String choosedOperation = scanner.nextLine();
        try {
            switch (choosedOperation) {
                case "add" -> {
                    System.out.println("type a value to be add and an index where this value will be add\n");
                    int value = scanner.nextInt();
                    int index = scanner.nextInt();
                    list.add(index, value);
                }
                case "remove" -> {
                    System.out.println("type an index to be removed\n");
                    int index = scanner.nextInt();
                    list.remove(index);
                }
            }
        } catch (Exception ex) {

        }
    }

    public void printValuesFromList() {
        final String joiningResult = this.list.stream()
                .map(value -> value == null ? "" : value.toString())
                .collect(Collectors.joining(" "));
        System.out.println("[" + joiningResult + "]");
    }
}
