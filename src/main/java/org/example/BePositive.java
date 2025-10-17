package org.example;

import java.util.Scanner;

public class BePositive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int countOfZero = 0;
            int countOfOne = 0;
            int countOfMinusOne = 0;
            for(int i = 0;i<n;i++){
                int x = in.nextInt();
                if(x==0){
                    countOfZero++;
                }else if(x==1){
                    countOfOne++;
                }else{
                    countOfMinusOne++;
                }
            }
            int ans = countOfZero;
            if(countOfMinusOne%2 == 1){
                ans++;
                ans++;
            }
            System.out.println(ans);
        }
    }
}
