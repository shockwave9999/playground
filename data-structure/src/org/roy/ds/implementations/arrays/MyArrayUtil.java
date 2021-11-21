package org.roy.ds.implementations.arrays;

import java.util.*;

public class MyArrayUtil {
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_BLUE = "\u001B[34m";

    public static int[] readArray(){
        Scanner sc= new Scanner(System.in);
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

    public static int[] generateRandomArray(Scanner sc){
        System.out.println(TEXT_BLUE+"Enter Array Size:"+TEXT_RESET);
        int size = sc.nextInt();
        int[] arr = new int[size];
        Random rn=new Random();
        int i=0;
        while(i < size){
            arr[i] = new Random().ints(-100,100).findFirst().getAsInt();
            i++;
        }
        return arr;
    }

    public static List<Integer> readArrayList(){
        int[] arr=readArray();
        List<Integer> intList = new ArrayList<Integer>(arr.length);
        for (int i : arr) {
            intList.add(i);
        }
        return intList;
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
}
