package com.company;

import java.util.Scanner;

public class n15651{
    static int num,count;
    static int [] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();


        count = sc.nextInt();
        arr = new int[count+1];

        start(0);
        System.out.println(sb);
    }

    static void start(int n){
        if(n == count){
            for(int i=1;i<=arr.length-1;i++){
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=1; i<=num; i++){
            arr[n+1] = i;
            start(n+1);
        }
    }
}