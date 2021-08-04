package org.roy.ds.implementations.arrays;

public class TraverseArraySinglePointer {

    public static void traverseLeftToRight(int[] arr){
        int i = 0;
        while(i < arr.length){
            ArrayTraversalRealtime.printArrayOneIndex(arr,i);
            i++;
        }
    }

    public static void traverseRightToLeft(int[] arr){
        int i = arr.length-1;
        while(i >= 0 ){
            ArrayTraversalRealtime.printArrayOneIndex(arr,i);
            i--;
        }
    }
}
