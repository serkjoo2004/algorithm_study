package com.company;

import java.util.Scanner;

public class n2440{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for(int i=num; 0<i; i--){
            for(int j=0; j<i; j++) sb.append('*');
            sb.append('\n');
        }
        sc.close();

        System.out.println(sb);
    }
}