package org.roy.ds.implementations.arrays;

public class MonotonicArrays {
    public static boolean isMonotonic(int[] arr) {
        if(arr.length<=2){
            return true;
        }
        //determine the array pattern increasing or decreasing
        Boolean increasing = null;
        Boolean monotonic = true;
        for(int i = 0; i< arr.length-1; i++){
            //compare if array pattern is changing
            if(arr[i]==arr[i+1]){
                // skip comparing when equal
                continue;
            }
            if(increasing == null){
                increasing = arr[i]<arr[i+1];
            }
            if(increasing != arr[i]<arr[i+1]){
                monotonic = false;
            }
        }
        return monotonic;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 7, 9, 10, 11};
        System.out.println("monotonic : " + isMonotonic(arr));
    }
}
