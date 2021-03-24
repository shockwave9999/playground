package org.roy.ds.implementations;

public class LinkedList<E> {

    public void addNode(E item){
        Node n = new Node(null,item,null);
    }

    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        // write your code here
    }

}