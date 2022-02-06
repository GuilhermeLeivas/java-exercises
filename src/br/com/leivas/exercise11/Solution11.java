package br.com.leivas.exercise11;

public class Solution11 {

    public static void main(String[] args) {

        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] strings = {"String 1", "String 2", "String 3", "String 4", "String 5"};
        ArrayPrinter<Integer> integerPrinter = new ArrayPrinter<>();
        ArrayPrinter<String> stringPrinter = new ArrayPrinter<>();
        integerPrinter.print(integers);
        stringPrinter.print(strings);
    }
}
