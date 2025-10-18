package org.example;

//https://codeforces.com/problemset/problem/1877/A

import java.util.Scanner;

public class GoalsOfVictory {
    public static void main(String[] args) {
        // net goal i.e scored and endured should be equal
        Scanner input = new Scanner(System.in);
        int t =  input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int sum = 0;
            for (int i = 0; i < n-1; i++) {
                int x =  input.nextInt();
                sum += x;
            }
            System.out.println(-sum);
        }
    }
}
