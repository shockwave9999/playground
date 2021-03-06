package org.roy.ds.implementations.linkedLists;

public class SinglyLinkedList<E> {

    private Node<E> head;

    public void addFirst(E item){
        head = new Node<>(item,head);
    }

    public void addLast(E item){
        insert(item);
    }

    public void insert(E item){
        Node<E> newNode = new Node<>(item,null);
        if(head==null){
            head = newNode;
        } else {
            Node<E> lastNode = head;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }

    public void printList(){
        Node<E> lastNode = head;
        while(lastNode.next != null){
            System.out.print(lastNode.item);
            lastNode = lastNode.next;
        }
        System.out.print(lastNode.item);
    }

    public int size(){
        int c = 1;
        Node<E> lastNode = head;
        while(lastNode.next != null){
            c++;
            lastNode = lastNode.next;
        }
        return c;
    }

    private static class Node<T> {
        T item;
        Node<T> next;

        Node(T element, Node<T> next) {
            this.item = element;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList<Character> list = new SinglyLinkedList<>();
        list.insert('R');
        list.insert('O');
        list.insert('Y');

        System.out.println(list.size());
        list.printList();
    }

}