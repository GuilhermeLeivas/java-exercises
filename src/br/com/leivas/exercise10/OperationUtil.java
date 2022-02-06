package br.com.leivas.exercise10;

import br.com.leivas.ScannerUtil;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public final class OperationUtil {
    private final List<Integer> list;
    private final ScannerUtil scannerUtil = ScannerUtil.getInstance();

    public OperationUtil(List<Integer> list) {
        this.list = list;
    }

    public void OnListOperation() {
        final Scanner scanner = scannerUtil.getScanner();
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

    public List<Integer> list() {
        return list;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (OperationUtil) obj;
        return Objects.equals(this.list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    @Override
    public String toString() {
        return "OperationUtil[" +
                "list=" + list + ']';
    }

}
