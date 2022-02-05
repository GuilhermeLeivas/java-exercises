package br.com.leivas.exercise5;

public class Calculator implements ICalculator<Integer, Integer> {
    @Override
    public Integer sum(Integer value1, Integer value2) {
        return value1 + value2;
    }

    @Override
    public Integer subtract(Integer value1, Integer value2) {
        return value1 - value2;
    }

    @Override
    public Integer multiply(Integer value1, Integer value2) {
        return value1 * value2;
    }

    @Override
    public Integer divide(Integer value1, Integer value2) {
        return value1 / value2;
    }
}
