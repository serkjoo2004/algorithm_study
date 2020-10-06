package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class n15649{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<a; i++){
            list.add(Integer.toString(i+1));
        }


        for(int i=0; i<b-1; i++){
            int ls = list.size();
            for(int k=0; k<ls;k++){
                for(int j=0; j<a; j++){
                    if(!(list.get(k).contains(Integer.toString(j+1)))){
                        list.add(list.get(k)+" "+ (j+1));
                    }
                }
            }
            int temp = i;
            list.removeIf(s->s.length()!=2*(temp+1)+1);
        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}