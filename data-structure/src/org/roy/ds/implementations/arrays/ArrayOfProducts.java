package org.roy.ds.implementations.arrays;
import java.util.*;

public class ArrayOfProducts {
    public int[] arrayOfProducts(int[] array) {
        //Calculate product of full array
        int[] resultArray = new int [array.length];
        int[] leftProduct = new int [array.length];
        int product = 1;
        int[] rightProduct = new int [array.length];
        for(int i=0; i<array.length; i++){
            leftProduct[i] = product;
            product = product * array[i];;
        }
        product =1;
        for(int i=array.length-1; i>=0; i--){
            rightProduct[i] = product;
            product = product * array[i];;
        }
        for(int i=0; i<array.length; i++){
            resultArray[i] = leftProduct[i]*rightProduct[i];
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 4, 2};
        ArrayOfProducts ap = new ArrayOfProducts();
        int[] result = ap.arrayOfProducts(arr);
        for (int i: result) {
            System.out.print(i+",");
        }
    }
}
