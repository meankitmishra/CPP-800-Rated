//package org.example;

//https://codeforces.com/problemset/problem/1878/A

import java.util.Scanner;

public class HowMuchDoesDeytonaCost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int x = in.nextInt();
            boolean flag = true;
            for(int i=0;i<n;i++){
                int a = in.nextInt();
                if(flag && a == x){
                    System.out.println("Yes");
                    flag = false;
                }
            }
            if(flag){
                System.out.println("No");
            }
        }
    }
}
