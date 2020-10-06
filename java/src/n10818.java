package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class n10818{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int [] arr = new int [count];

        for(int i=0; i<count; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[count-1]);
    }
}