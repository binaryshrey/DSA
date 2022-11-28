package GeeksForGeeks.Arrays.Arrangement;

import java.util.Arrays;
import java.util.Scanner;

/**
 Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j] if i is odd and j < i
 Input : arr = {1, 2, 1, 4, 5, 6, 8, 8} 1,1,2,4,5,6,8,8
 Output : 4 5 2 6 1 8 1 8

 Time-Complexity :

 https://www.geeksforgeeks.org/rearrange-array-arri-arrj-even-arri/

 **/

public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        rearrangeArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void rearrangeArray(int[] arr){
        int[] clonedArr = arr.clone();
        int x = (int)(Math.ceil(clonedArr.length/2)) -1;
        int y = clonedArr.length - (int)(Math.ceil(clonedArr.length/2));
        Arrays.sort(clonedArr);

        for(int i=0;i<clonedArr.length;i+=2){
            arr[i] = clonedArr[x];
            x-=1;
        }
        for(int i=1;i<clonedArr.length;i+=2){
            arr[i] = clonedArr[y];
            y+=1;
        }
    }

}
