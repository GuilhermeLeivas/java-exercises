package br.com.leivas.exercise13;

public class Solution13 {
    public static void main(String[] args) {

        ILinkedList<LinkedListImpl.Node, Integer> list = new LinkedListImpl();
        LinkedListImpl.Node head = list.insertAtPosition(null, 3, 0);
        LinkedListImpl.Node head1 = list.insertAtPosition(head, 4, 0);
        final LinkedListImpl.Node head2 = list.insert(head1, 55);
        LinkedListImpl.Node head3 = list.insertAtPosition(head1, 5, 2);
    }
}
