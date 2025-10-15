package org.example;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        int ans = 0;
        for(int i = 0;i<total;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            if(a+b+c >= 2){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
