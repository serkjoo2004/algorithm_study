package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class n1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc. nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=0; i<num; i++){
            list.add(sc.nextInt());
        }

        for(int i=0; i<num; i++){
            list2.add(sc.nextInt());
        }

        Collections.sort(list);
        Collections.reverse(list);
        Collections.sort(list2);

        int result = 0;

        for(int i=0; i<num; i++){
            result = result + (list.get(i) * list2.get(i));
        }


        System.out.println(result);
    }
}