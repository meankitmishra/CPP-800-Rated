package org.example;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test =  in.nextInt();
        while(test-- >= 0){
            String s =  in.nextLine();

            //if s.length() <= 10 we do nothing
            int n = s.length();
            if(n<=10){
                System.out.println(s);
                continue;
            }
            //if it is greater than 10 we do something
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(s.charAt(0));
            stringBuilder.append(Integer.valueOf(n-2));
            stringBuilder.append(s.charAt(n-1));
            System.out.println(stringBuilder.toString());
        }


    }
}
