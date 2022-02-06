package br.com.leivas.exercise9;

public interface Factory<I, O> {

    O produce(I input);
}
