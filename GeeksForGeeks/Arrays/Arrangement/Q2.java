package GeeksForGeeks.Arrays.Arrangement;

import java.util.Arrays;
import java.util.Scanner;

/**
 reverse an array or string
 Input : arr = {1, 2, 3}
 Output : {3, 2, 1}

 Time-Complexity : O(n)

 https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

 **/

public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        reverse_iterative(arr,0,arr.length-1);
        reverse_recursive(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void reverse_iterative(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void reverse_recursive(int[] arr, int start, int end){
        if(start >= end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse_recursive(arr,start+1,end-1);

    }
}
