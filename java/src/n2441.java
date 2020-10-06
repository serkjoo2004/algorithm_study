package com.company;

import java.util.Scanner;

public class n2441{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        char [] arr = new char[num];

        for(int i=0; i<num; i++) arr[i] = '*';

        sb.append(arr).append('\n');

        for(int i=0; i<num-1; i++){
            arr[i] = ' ';
            sb.append(arr).append('\n');
        }

        sc.close();
        System.out.println(sb);
    }
}