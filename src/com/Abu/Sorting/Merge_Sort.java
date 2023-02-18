package com.Abu.Sorting;
import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr={8,4,5,2,6,2};

        //System.out.println(Arrays.toString(arr));
        arr=mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid= arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    public  static int[] merge(int[] f,int[] s){
        int i=0,j=0,k=0;
        int[] merged=new int[f.length+s.length];
        while (i<f.length && j<s.length){
            if(f[i]<s[j]){
                merged[k]=f[i];
                i++;
                k++;
            }
            else{
                merged[k]=s[j];
//                k++;
                j++;
                k++;
            }
            //k++;
        }
        while (i<f.length){
            merged[k]=f[i];
            i++;
            k++;
        }
        while (j<s.length){
            merged[k]=s[j];
            k++;
            j++;
        }

        return merged;

    }
}

