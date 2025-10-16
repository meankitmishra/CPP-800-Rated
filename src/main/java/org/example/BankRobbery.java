package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class BankRobbery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int curr = in.nextInt();
        int left = in.nextInt();
        int right = in.nextInt();
        int ans = 0;
//        HashMap<Integer,Integer> map = new HashMap<>();
        int size = in.nextInt();
        for(int i = 0;i<size;i++){
            int x =  in.nextInt();
            if(x > left && x<right){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
