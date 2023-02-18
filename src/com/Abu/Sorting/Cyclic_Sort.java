package com.Abu.Sorting;

import java.util.Arrays;

public class Cyclic_Sort{
    public static void main(String[] args) {
        int[] arr={3,5,1,4,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int i=0;
        while (i<arr.length){
            int correct_index=arr[i]-1;
            if(arr[i]!=arr[correct_index]){
                swap(arr,i,correct_index);
            }
            else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

//This Code Was Contributed by 'F.Mohamed Abdullah'
