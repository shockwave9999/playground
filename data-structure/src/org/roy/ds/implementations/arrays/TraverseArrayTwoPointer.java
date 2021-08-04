package org.roy.ds.implementations.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class TraverseArrayTwoPointer {
    public static void traversePeripheryToMiddle(int[] arr){
        int i=0;
        int j = arr.length-1;
        while ( i<=j ){
            Set<Integer> indexes = new HashSet<>(Arrays.asList(i,j));
            ArrayTraversalRealtime.printArrayMultiIndex(arr,indexes);
            i++;
            j--;
        }
    }

}
