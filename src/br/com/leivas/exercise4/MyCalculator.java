package br.com.leivas.exercise4;

import java.util.stream.IntStream;

public class MyCalculator implements AdvancedArithmetic<Integer> {

    @Override
    public Integer divisorSum(Integer n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).sum();
    }
}
