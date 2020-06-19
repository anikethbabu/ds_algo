package com.aniketh;

public class LinkedList {
    private Node head;
    public void AddFront(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public Node getHead() {
        return head;
    }

    public int getFirst()
    {
        return head.data;
    }
    public int getLast()
    {
        if (head == null)
        {
            throw new IllegalStateException("Empty List");
        }
        Node current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        return current.data;
    }
    public void addBack(int data)
    {
        if (head == null)
        {
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        current.next = new Node(data);

    }
    public int size()

    {

        if (head == null)
        {
            throw new IllegalStateException("Empty List");
        }
        int counter = 1;
        Node current = head;
        while(current.next != null)
        {
            current = current.next;
            counter ++;
        }

        return counter;
    }
    public void clear()
    {
        head = null;
    }
    public void delete(int data) {
        if(head.data == data)
        {
            return;
        }
        if (head.data == data)
        {
            head = head.next;
            return;
        }
        Node current = head;

        while (current.next != null)
        {
            if(current.data == data) {
                current.next = current.next.next;
                return;
            }
        }

    }


}
