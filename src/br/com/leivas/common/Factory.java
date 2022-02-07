package br.com.leivas.common;

public interface Factory<I, O> {

    O produce(I input);
}
