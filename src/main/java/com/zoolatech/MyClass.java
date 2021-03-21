package com.zoolatech;

public class MyClass {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(1);
        System.out.println("Before" + list);

        boolean result = list.removeAll(1);

        System.out.println("Result = " + result);
        System.out.println("After" + list);
    }
}

class LinkedList<E> {
    private Node<E> head;

    private static class Node<E> {
        E value;
        Node<E> next;
    }

    public boolean removeAll(E e) {
        boolean changed = false;
        while (head != null && head.value.equals(e)) {
            head = head.next;
            changed = true;
        }
        Node<E> cur = head;
        Node<E> previous = cur;
        while (cur != null) {
            if (cur.value.equals(e)) {
                while (cur != null && cur.value.equals(e)) {
                    cur = cur.next;
                }
                previous.next = cur;
                changed = true;
            }
            previous = cur;
            if (cur != null) {
                cur = cur.next;
            }
        }

        return changed;
    }

    public boolean add(E e) {
        if (e == null) {
            throw new IllegalArgumentException("Null elements are not allowed");
        }
        Node<E> newNode = new Node<>();
        newNode.value = e;
        if (head == null) {
            head = newNode;
            return true;
        }

        Node<E> lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        if (head == null) {
            return builder.append(']').toString();
        }

        Node<E> node = head;
        while (true) {
            builder.append(String.valueOf(node.value));
            if (node.next == null) {
                return builder.append(']').toString();
            }
            builder.append(", ");
            node = node.next;
        }
    }
}

