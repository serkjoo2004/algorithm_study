package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class n1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        ArrayList<Character> list = new ArrayList<>();

        for(int i=0; i<a.length(); i++){
            list.add(a.charAt(i));
        }

        Collections.sort(list);
        Collections.reverse(list);

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<a.length(); i++){
            sb.append(list.get(i));
        }

        System.out.println(sb);
    }
}