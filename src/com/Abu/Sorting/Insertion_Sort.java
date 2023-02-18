package com.Abu.Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr={8,4,5,6,1,2,3};
        System.out.println(Arrays.toString(arr));
        //selectionsort(arr);
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }



    private static void insertionsort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }


    public static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;

    }
}

//This Code was contributed by 'F.Mohamed Abdullah'
