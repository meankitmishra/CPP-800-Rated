package org.example;

import java.util.Scanner;

public class GameWithInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t =  input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            if(n%3==0){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }
    }
}
