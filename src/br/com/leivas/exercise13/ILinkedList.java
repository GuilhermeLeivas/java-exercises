package br.com.leivas.exercise13;

public interface ILinkedList<N, D> {

    N insert(N head, D data);

    N insertAtHead(N head, D data);

    N insertAtPosition(N head, D data, int index);
}
