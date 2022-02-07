package br.com.leivas.exercise13;

public class Solution13 {
    public static void main(String[] args) {

        ILinkedList<LinkedListImpl.Node, Integer> list = new LinkedListImpl();
        final LinkedListImpl.Node head = list.insertAtPosition(null, 3, 0);
        final LinkedListImpl.Node head1 = list.insertAtPosition(head, 4, 0);
        final LinkedListImpl.Node head2 = list.insert(head1, 55);
        final LinkedListImpl.Node head3 = list.insertAtPosition(head2, 5, 2);
        final LinkedListImpl.Node head4 = list.insertAtPosition(head3, 85, 0);
        // In exercise 13 it says: "Do NOT print anything to stdout/console.". So, i won't print anything on the console.
    }
}
