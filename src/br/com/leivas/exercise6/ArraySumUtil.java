package br.com.leivas.exercise6;

import br.com.leivas.common.ScannerUtil;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraySumUtil {

    private final ScannerUtil scannerUtil = ScannerUtil.getInstance();
    private int elementsLength = 0;
    private int[] array;


    public void readElementsTotal() {
        final Scanner scanner = scannerUtil.getScanner();
        System.out.println("Type how many elements it will be in the array\n");
        this.elementsLength = scanner.nextInt();
        this.array = new int[this.elementsLength];
    }

    public void readEachElement() {
        if (this.elementsLength != 0) {
            final Scanner scanner = scannerUtil.getScanner();
            for (int i = 0; i < this.elementsLength; i++) {
                System.out.println("Type element " + (i + 1));
                this.array[i] = scanner.nextInt();
            }
        }
    }

    public void printAllElements() {
        System.out.println("All elements: " + Arrays.toString(this.array));
    }

    public void printSumOfAllElements() {
        if (this.array == null || this.array.length == 0) {
            System.out.println("Empty array, so the sum is 0");
            return;
        }
        int sum = IntStream.of(this.array).sum();
        System.out.println(this.formatSumString() + " = " + sum);
    }

    private String formatSumString() {
        return Arrays.stream(this.array).mapToObj(element -> String.format("%s", element))
                .collect(Collectors.joining("+"));
    }
}
