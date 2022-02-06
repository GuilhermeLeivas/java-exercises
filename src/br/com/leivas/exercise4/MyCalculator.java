package br.com.leivas.exercise4;

import java.util.stream.IntStream;

public class MyCalculator implements AdvancedArithmetic<Integer> {

    @Override
    public Integer divisorSum(Integer n) {
        if (n > 1000) {
            throw new ValueNotValidException("Value should be at most 1000");
        }
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).sum();
    }
}
