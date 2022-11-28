package GeeksForGeeks.Arrays.Arrangement;

import java.util.HashSet;
import java.util.Scanner;

/**
 Rearrange an array such that arr[i] = i
 Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
 Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]

 Time-Complexity : O(n^2) , O(n)

 https://www.geeksforgeeks.org/rearrange-array-arri/

 **/

public class Q1 {
    public static void main(String[] args){
        rearrange();
        rearrange_optimized();
    }

    private static void rearrange(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int no = -1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j] == i){
                    no = arr[j];
                }
            }
            System.out.print(no+",");
            no = -1;
        }
    }

    private static void rearrange_optimized(){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>(10);
        for(int i=0; i<10;i++){
            set.add(sc.nextInt());
        }
        for (int i=0;i<10;i++){
            if(set.contains(i)){
                System.out.print(i+", ");
            }else{
                System.out.print("-1, ");
            }
        }
    }
}
