package org.example;

import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalCandies = in.nextInt();
        int friends = in.nextInt();
        int max = totalCandies /  friends;
        if(totalCandies % friends != 0) {
            max++;
            int minGettingFriends = friends - (totalCandies % friends);
            for(int i = 0;i<minGettingFriends;i++){
                System.out.print(max-1 +" ");
            }
            int remainingFriends = friends - minGettingFriends;
            for(int i = 0;i<remainingFriends;i++ ){
                System.out.print(max+ " ");
            }
        }
        else{
            for(int i = 0;i<friends;i++){
                System.out.print(max+" ");
            }
        }


    }
}
