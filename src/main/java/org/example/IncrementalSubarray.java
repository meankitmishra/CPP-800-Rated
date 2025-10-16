package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IncrementalSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test =  scanner.nextInt();

        while (test-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] arr = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = scanner.nextInt();
            }
            int ans = solve(n,m,arr);
            System.out.println(ans);
        }
    }
    public static int solve(int n, int m, int[] arr) {

        int max = Integer.MIN_VALUE;
        if(m == 1){
            max = arr[0];
        }
        for(int i = 0;i<m-1;i++){
            if(arr[i]+1 != arr[i+1]){
                return 1;
            }
            max = Math.max(max,arr[i+1]);
        }




//        int startSize = Math.max(m,max);

//        if(startSize>n) return 1;
        return n-max+1;
    }
}
