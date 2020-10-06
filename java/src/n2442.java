package com.company;

import java.util.Scanner;

public class n2442{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            for(int j=i; j<num-1; j++) sb.append(' ');
            for(int k=0; k<2*(i+1)-1;k++) sb.append('*');
            sb.append('\n');
        }


        sc.close();
        System.out.println(sb);
    }
}