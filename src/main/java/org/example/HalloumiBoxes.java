package org.example;

import java.util.Scanner;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-->0){
            int n  = scanner.nextInt();
            int max =  scanner.nextInt();
            int[] arr = new int[n];
            boolean isSorted = true;
            for(int i = 0;i<n;i++){
                arr[i] = scanner.nextInt();
                if(i!=0){
                    if(arr[i] < arr[i-1]){
                        isSorted = false;
                    }
                }
            }
            if(isSorted){
                System.out.println("YES");
                continue;
            }
            if(max != 1 ){
                System.out.println("YES");
                continue;
            }
            if(max == 1 && !isSorted){
                System.out.println("NO");
            }
        }

    }
}
