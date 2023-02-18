package com.Abu.Sorting;

import java.util.*;

public class Bubble_Sort {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of the Array:");
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubble_sort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=1;j< arr.length;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
