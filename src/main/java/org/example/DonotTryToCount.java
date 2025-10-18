package org.example;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/1881/A
public class DonotTryToCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t  = in.nextInt();
        while(t-->0){
            int a = in.nextInt();
            int b = in.nextInt();

            String s = in.next();
            String x = in.next();

            if(a>=b){
                if(s.contains(x)){
                    System.out.println(0);
                }else{
                    s = s + s;
                    if(s.contains(x)){
                        System.out.println(1);

                    }else{
                        System.out.println(-1);
                    }
                }
            }
            else{
                int tries = 0;
                int flag = 0;
                while(s.length()<=25){
                    tries++;
                    s = s+s;
                    if(s.contains(x)){
                        System.out.println(tries);
                        flag = 1;
                        break;
                    }
                }
                if(flag==0){
                    System.out.println(-1);
                }


            }
        }
    }


}
