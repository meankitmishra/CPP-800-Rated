package org.example;

import java.util.Scanner;

public class ElFucho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int winner  = sc.nextInt();
            int loser = 0;
            int round = 0;
            while(winner!=1 || loser!=1){
                int temp1 = winner/2;
                winner = winner - temp1;
                int temp2 = loser/2;
                loser = loser- temp2;
                round+=(temp1 + temp2);
                loser+=temp1;
//                System.out.println(round +" "+winner+" "+loser);
            }
            round++;
            System.out.println(round);
        }
    }
}
