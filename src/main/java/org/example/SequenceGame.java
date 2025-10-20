package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class SequenceGame {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            ArrayList<Integer> ans = new ArrayList<Integer>();
            ans.add(arr[0]);
            for(int i = 1;i<n;i++){
                if(arr[i]>=arr[i-1]){
                    ans.add(arr[i]);
                }else{
                    ans.add(arr[i]);
                    ans.add(arr[i]);
                }
            }
            System.out.println(ans.size());
            for(int i = 0;i<ans.size();i++){
                System.out.print(ans.get(i)+ " ");
            }
            System.out.println();
        }
    }
}
