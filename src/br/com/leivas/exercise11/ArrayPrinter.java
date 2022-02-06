package br.com.leivas.exercise11;

import java.util.Arrays;

public class ArrayPrinter<T> {
    public void print(T[] element) {
        Arrays.stream(element).forEach(System.out::println);
    }
}
