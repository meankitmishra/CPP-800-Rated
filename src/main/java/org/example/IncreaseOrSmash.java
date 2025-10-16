package org.example;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class IncreaseOrSmash {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            Set<Integer> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                set.add(num);
            }
            int ans = ((set.size()-1)*2)+1;
            System.out.println(ans);
        }
    }

}
