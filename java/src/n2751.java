package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class n2751 {
    public static void main(String[] args) {

        int num;

        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append('\n');
        }
        System.out.println(sb);

    }
}




