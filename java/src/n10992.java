package com.company;

import java.util.Scanner;

public class n10992{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            for(int k=0; k<num-i-1; k++) sb.append(' ');
            for(int k=0; k<2*(i+1)-1; k++){
                if(i==0 || i==num-1) sb.append('*');
                else{
                    if(k == 0 || k ==(2*(i+1)-2)) sb.append('*');
                    else sb.append(' ');
                }
            }
            sb.append('\n');
        }

        sc.close();
        System.out.println(sb);
    }
}
