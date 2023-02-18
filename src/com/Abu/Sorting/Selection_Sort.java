package com.Abu.Sorting;
import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of the Array:");
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void selection_sort(int[] arr) {
        ;
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max=getmax(arr,0,last);
            swap(arr,max,last);
        }
    }

    private static void swap(int[] arr, int first, int last) {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }

    private static int getmax(int[] arr, int n, int last) {
        int max=n;
        for(int i=max;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

}
