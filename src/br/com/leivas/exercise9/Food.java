package br.com.leivas.exercise9;

public interface Food {

    default String getType() {
        return this.getClass().getSimpleName();
    }

    default void makeFood() {
        System.out.printf("Making a delicious %s\n", this.getType());
    }
}
