package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class n2217{
    static int num;
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        for(int i=0; i<num; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        if(num == 1){
            System.out.println(list.get(0));
            return;
        }

        int j=0;
        int result=0;
        for(int i=list.size(); i>0; i--){
            if((i* list.get(j)) > result) {
                result = i*list.get(j);
            }
            j++;
        }
        System.out.println(result);
    }
}