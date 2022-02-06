package br.com.leivas.exercise13;

public class LinkedListImpl implements ILinkedList<LinkedListImpl.Node, Integer> {
    private Node head; // head of list

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    @Override
    public Node insert(Node head, Integer data) {
        Node new_node = new Node(data);
        new_node.next = null;
        if (head == null) {
            head = new_node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return head;
    }

    @Override
    public Node insertAtHead(Node head, Integer data) {
        Node new_node = new Node(data);
        new_node.next = head;
        this.head = new_node;
        return this.head;
    }

    @Override
    public Node insertAtPosition(Node head, Integer data, int index) {
        Node currNode = head, prev = null;
        // If passed index is 0, then we should insert at the head.
        if (index == 0) {
            return this.insertAtHead(head, data);
        }
        int counter = 0;
        // index is not head, we must search for the required position.
        while (currNode != null) {
            if (counter == index) {
                Node newNode = new Node(data);
                prev.next = newNode;
                newNode.next = currNode;
                break;
            } else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
        // Position not found
        if (currNode == null) {
            throw new PositionNotFoundException("The desired position was not found!");
        }
        return this.head;
    }
}
