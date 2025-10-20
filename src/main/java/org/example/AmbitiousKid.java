package org.example;

import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int x = in.nextInt();
            min = Math.min(min,Math.abs(x));
        }
        System.out.println(min);
    }
}
