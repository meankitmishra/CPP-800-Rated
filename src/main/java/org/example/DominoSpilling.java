package org.example;

import java.util.Scanner;

public class DominoSpilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m =  sc.nextInt();
        int n = sc.nextInt();

        int area = m*n;
        System.out.println(area/2);
    }
}
