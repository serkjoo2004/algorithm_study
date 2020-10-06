package com.company;

import java.util.Scanner;

public class n2439{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int count = sc.nextInt();
        char [] arr = new char[count];
        for(int i=0; i<count; i++){
            arr[i] = ' ';
        }

        for(int i=count-1; 0<=i; i--){
            arr[i] = '*';
            sb.append(arr).append("\n");
        }

        System.out.println(sb);
    }
}