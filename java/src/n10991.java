package com.company;

import java.util.Scanner;

public class n10991{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            for(int j=0; j<num-i-1; j++) sb.append(' ');
            for(int k=0; k<=i; k++) sb.append("* ");
            sb.append('\n');
        }

        sc.close();
        System.out.println(sb);
    }
}