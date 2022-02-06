package br.com.leivas.exercise13;

public record Node<T>(T data) {

    public T getData() {
        return data;
    }
}
