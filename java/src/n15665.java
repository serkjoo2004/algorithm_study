package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class n15665{
    static int count, num;
    static int [] arr;
    static ArrayList<Integer> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        count = sc.nextInt();

        arr = new int[count];

        for(int i=0; i<num; i++){
            int temp = sc.nextInt();
            if(!list.contains(temp)){
                list.add(temp);
            }
        }

        Collections.sort(list);
        sol(0);
        System.out.println(sb);
        sc.close();

    }
    static void sol(int r){
        if (r == count){
            for(int i : arr){
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0;i<list.size();i++){
            arr[r] = list.get(i);
            sol(r+1);
        }
    }
}