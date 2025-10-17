package org.example;

import java.util.Scanner;

public class JaggedSwaps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t =  in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int first = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                if(i==0){
                    first = x;
                }
                min = Math.min(min, x);
            }
//            System.out.println(min + " " + first);
            if(first != min){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}
