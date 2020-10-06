package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class n2212 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int snum = sb.nextInt();
        int k = sb.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=0; i<snum; i++){
            int v = sb.nextInt();
            if(!(list.contains(v))){
                list.add(v);
            }
        }
        Collections.sort(list);

        for(int i=0; i<list.size()-1;i++){
            list2.add(list.get(i+1)-list.get(i));
        }

        Collections.sort(list2);

        int result = 0;

        if(k>list2.size()) result = 0;
        else{
            int n = list2.size()+1 - k;
            for(int i=0; i<n; i++) result = result + list2.get(i);
        }
        System.out.println(result);

    }
}