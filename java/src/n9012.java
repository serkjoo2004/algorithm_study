package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class n9012 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();


        for(int i=0; i<n; i++){
            list.add(sc.next());
        }

        for(int i=0; i<list.size(); i++){
            if(checkvps(list.get(i))) result.add("YES");
            else result.add("NO");
        }

        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i));
        }
    }

    private static boolean checkvps(String s){
        int num = 0;
        for (int i=0; i<s.length();i++){
            if (s.charAt(i) == '(') num++;
            else {
                num--;
                if (num<0) return false;
            }
        }
        if (num==0) return true;
        else return false;
    }
}