package br.com.leivas.exercise13;

import java.util.LinkedList;

public final class StackImpl<T> extends LinkedList<T> {

    public T insertNode(T node) {
        super.addFirst(node);
        return node;
    }

    public T removeNode() {
        return super.remove();
    }
}
