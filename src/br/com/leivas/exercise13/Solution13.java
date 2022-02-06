package br.com.leivas.exercise13;

public class Solution13 {
    public static void main(String[] args) {
        StackImpl<Node<Integer>> stack = new StackImpl<>();
        Node<Integer> head = stack.insertNode(new Node<>(3));
        head = stack.insertNode(new Node<>(4));
    }
}
