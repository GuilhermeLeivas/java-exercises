package br.com.leivas.exercise5;

public interface ICalculator<I, O> {

    O sum(I value1, I value2);

    O subtract(I value1, I value2);

    O multiply(I value1, I value2);

    O divide(I value1, I value2);

    default void printAvailableOperations() {
        System.out.println(" Choose the calculation:\n" +
                "                        -sum\n" +
                "                        -subtract\n" +
                "                        -multiply\n" +
                "                        -divide");
    }
}
