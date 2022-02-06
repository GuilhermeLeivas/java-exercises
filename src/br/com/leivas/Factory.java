package br.com.leivas;

public interface Factory<I, O> {

    O produce(I input);
}
