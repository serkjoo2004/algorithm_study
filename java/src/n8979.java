package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class n8979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int slt = sc.nextInt();

        HashMap hs = new HashMap<>();



        for(int i=0; i<num; i++){
            ArrayList<Integer> list = new ArrayList<>();

            int key = sc.nextInt();
            list.add(sc.nextInt());
            list.add(sc.nextInt());
            list.add(sc.nextInt());

            hs.put(key,list);

        }

        int result = 1;
        for(int i=0; i<num; i++){
            if(((ArrayList<Integer>) hs.get(i+1)).get(0) > ((ArrayList<Integer>) hs.get(slt)).get(0)){
                result = result + 1;
            }
            else if(((ArrayList<Integer>) hs.get(i+1)).get(0) == ((ArrayList<Integer>) hs.get(slt)).get(0)){
                if(((ArrayList<Integer>) hs.get(i+1)).get(1) > ((ArrayList<Integer>) hs.get(slt)).get(1)){
                    result = result + 1;
                }
                else if(((ArrayList<Integer>) hs.get(i+1)).get(1) == ((ArrayList<Integer>) hs.get(slt)).get(1)){
                    if(((ArrayList<Integer>) hs.get(i+1)).get(2) > ((ArrayList<Integer>) hs.get(slt)).get(2)){
                        result = result + 1;
                    }
                }
            }
        }

        System.out.print(result);
    }
}