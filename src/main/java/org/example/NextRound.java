package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        // here we will sort the array and find the kth score
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        k = n-k;
        int kth = arr[k];
        //after finding the kth score we will find the number of contestant getting score greater or equal to that of kth score
        int ans = 0;
        for(int i = n-1; i >= 0; i--){

//            System.out.println(i +" " + n + " " + arr[i]);
            if(arr[i] >= kth && arr[i] > 0){
//                System.out.println(i);
                ans++;
            }else{
                break;
            }
        }
        System.out.println(ans);
    }
}
