package com.company;

import java.util.Scanner;

public class n11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b));
        }
    }
}
