package org.example;

import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            String s = input.next();
            int max = 0;
            int totalEmpty = 0;
            int count = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '.'){
                    if(count!=0){
                        count++;
                    }else{
                        count = 1;
                    }
                    totalEmpty++;
                }else{
                    max = Math.max(max, count);
                    count = 0;
                }
            }
            max = Math.max(max, count);
            if(max >=3){
                System.out.println(2);
            }else{
                System.out.println(totalEmpty);
            }
        }
    }
}
