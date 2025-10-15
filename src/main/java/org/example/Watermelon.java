package org.example;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        // the weight should be divided into 2 parts both of them should be non-zero and even
        // let x and y be the 2 parts and both are even and positive
        // x+y will be even and positive and >= 4 as both are non-zero

        //therefore if x is odd or less than 4 it is impossible to divide the watermelon
        if(w%2!=0 || w<4){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}
