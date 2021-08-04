package org.roy.ds.implementations.arrays;

import java.util.Scanner;
import java.util.Set;

public class ArrayTraversalRealtime {
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE = "\u001B[37m";

    public static void main(String[] args) {

        System.out.println(TEXT_GREEN + "Realtime Array Traversal View" + TEXT_RESET);
        System.out.println(TEXT_GREEN + "-----------------------------" + TEXT_RESET);
        System.out.println(TEXT_BLUE + "Enter 1: Traverse Left to Right single pointer." + TEXT_RESET);
        System.out.println(TEXT_BLUE + "Enter 2: Traverse Right to Left single pointer." + TEXT_RESET);
        System.out.println(TEXT_BLUE + "Enter 3: Traverse Periphery to Middle double pointer." + TEXT_RESET);
        System.out.println(TEXT_RED + "Please Enter Choice:" + TEXT_RESET);
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int[] arr;
        arr = readArray(sc);
        switch (choice) {
            case 1:
                TraverseArraySinglePointer.traverseLeftToRight(arr);
                break;
            case 2:
                TraverseArraySinglePointer.traverseRightToLeft(arr);
                break;
            case 3:
                TraverseArrayTwoPointer.traversePeripheryToMiddle(arr);
                break;
            default:
                break;
        }
        sc.close();
    }

    public static int[] readArray(Scanner sc){
        System.out.println(TEXT_BLUE+"Enter Array Size:"+TEXT_RESET);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i=0;
        System.out.println(TEXT_BLUE+"Enter Array Elements One by One:"+TEXT_RESET);
        while(i < size){
            arr[i] = sc.nextInt();
            i++;
        }
        return arr;
    }

    public static void printArrayOneIndex(int[] arr,int index){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        for (int i=0;i<arr.length;i++) {
            if(i != index) {
                System.out.print(arr[i]+" ");
            }else{
                System.out.print(TEXT_RED + arr[i]+ TEXT_RESET+" ");
            }
        }
    }

    public static void printArrayMultiIndex(int[] arr, Set<Integer> indexes){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        for (int i=0;i<arr.length;i++) {
            if(!indexes.contains(i)) {
                System.out.print(arr[i]+" ");
            }else{
                System.out.print(TEXT_RED + arr[i]+ TEXT_RESET+" ");
            }
        }
    }
}
