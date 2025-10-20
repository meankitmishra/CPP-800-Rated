//package org.example;

import java.util.Scanner;

public class Buttons {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            if(a > b){
                System.out.println("First");
                continue;
            }else if(a == b && c%2!=0){
                System.out.println("First");
                continue;
            }
            System.out.println("Second");
        }
    }
}
