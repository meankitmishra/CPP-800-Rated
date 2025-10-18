//package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class DoremysPaint3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int i=0;i<n;i++){
                int x = in.nextInt();
                map.put(x,map.getOrDefault(x,0)+1);
            }
            if(n==2){
                System.out.println("Yes");
                continue;
            }
            if(map.size()==1){
                System.out.println("Yes");
                continue;
            }
            if(n%2==0){
                if(map.size()>2){
                    System.out.println("NO");
                    continue;
                }else{
                    for(Integer key:map.keySet()){
                         if(map.get(key)==n/2){
                             System.out.println("Yes");
                             break;
                         }else{
                             System.out.println("NO");
                             break;
                         }
                    }
                    continue;
                }
            }else{
                if(map.size()>2){
                    System.out.println("NO");
                }else{
                    for(Integer key:map.keySet()){
                        if(map.get(key)==n/2 || map.get(key)==(n/2)+1){
                            System.out.println("Yes");
                            break;
                        }else{
                            System.out.println("NO");
                            break;
                        }
                    }
                    continue;
                }
            }
        }
    }
}
