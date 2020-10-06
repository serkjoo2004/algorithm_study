package com.company;

import java.util.Scanner;

public class n2522{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        char [] arr = new char[num];

        for(int i=0; i<arr.length; i++) arr[i] = ' ';

        for(int i=0; i<arr.length; i++){
            arr[arr.length-1-i] = '*';
            sb.append(arr).append('\n');
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = ' ';
            sb.append(arr).append('\n');
        }

        sc.close();
        System.out.println(sb);
    }
}