package com.progress.demo;

public class Util {

    //add a method to remove duplicates from an array of integers
    public static int[] removeDuplicates(int[] arr) {
        int[] result = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            //if the current element is not equal to the next element, add it to the result array
            if (arr[i] != arr[i + 1]) {
                result[j++] = arr[i];
            }
        }
        //add the last element
        result[j++] = arr[arr.length - 1];

        //create a new array with the size of the result array
        
        //200 300 400 401

        int[] finalResult = new int[j];
        
        return result;
    }
    
}
