package com.Abu.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Enter how many elements in array:");
        int ele=in.nextInt();
        int[] arr=new int[ele];

        //Getting values from the user for Array
        for (int i = 0; i < ele; i++) {
            System.out.print("Enter "+(i+1)+" value:");
            arr[i]= in.nextInt();
        }
        //The Array
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter the value to search in Array:");
        int key=in.nextInt();

        int pos=linear(arr,key);
        System.out.println("Value found in "+pos+" position");


    }

    private static int linear(int[] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                return i+1;
            }
        }
        return -1;
    }
}
//This code was contributed by 'F.Mohamed Abdullah'
