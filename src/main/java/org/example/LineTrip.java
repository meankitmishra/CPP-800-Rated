package org.example;

import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while(test-->0){
            int n = input.nextInt();
            int x = input.nextInt();

            int ans = 0;
            int distance = 0;
            int curr = 0;
            for(int i = 0;i<n;i++){
                int next = input.nextInt();
                distance = Math.max(distance , next-curr);
                curr = next;
            }
            distance = Math.max(distance, 2*(x-curr));
            ans = distance;
            System.out.println(ans);
        }
    }
}
