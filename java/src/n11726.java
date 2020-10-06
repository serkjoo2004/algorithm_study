package com.company;

import java.util.Scanner;

public class n11726{
    static int num;
    static int [] arr;
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        arr = new int[num+1];
        arr[0] = 1;
        arr[1] = 1;

        if(num == 1){
            System.out.println(1);
            return;
        }

        dp(2);
    }

    static void dp(int r){
        arr[r] = (arr[r-2] + arr[r-1]) % 10007;

        if(r == num){
            System.out.println(arr[num]);
            return;
        }

        dp(r+1);
    }
}