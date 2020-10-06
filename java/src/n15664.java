package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class n15664{
    static int num, count;
    static int [] arr;
    static boolean [] check;
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<String> slist = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        count = sc.nextInt();
        arr = new int[count];
        check = new boolean[num];

        for(int i=0; i<num; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        sol(0);
        System.out.println(sb);
        sc.close();

    }

    static void sol(int r){
        if(r == count){
            for(int i=1; i<count; i++){
                if(!(arr[i-1] <= arr[i])) return;
            }
            StringBuilder ch = new StringBuilder();

            for(int i : arr) {
                ch.append(i).append(" ");
            }

            if(!slist.contains(ch.toString())) {
                slist.add(ch.toString());
                sb.append(ch.toString()).append("\n");
            }
        }
        else{
            for(int i=0; i<num; i++){
                if(!check[i]){
                    check[i] = true;
                    arr[r] = list.get(i);
                    sol(r+1);
                    check[i] = false;
                }
            }
        }
    }
}