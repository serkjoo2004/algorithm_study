package com.company;

import java.util.Scanner;

public class n1747 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        Boolean b;

        StringBuilder origin = new StringBuilder();
        String [] list;
        list = num.split(",");

        for(int i=0; i<list.length; i++) origin.append(list[i]);

        String s = origin.toString();
        int sti = Integer.parseInt(s);
        if (sti<2) sti = 2;

        while(true){
            b = true;

            StringBuilder sb = new StringBuilder();


            for(int i=0; i<s.length(); i++){
                sb.append(s.charAt(s.length()-1-i));
            }
            if(s.equals(sb.toString())) {
                for (int i = 2; i < sti; i++) {
                    if (sti % i == 0) {
                        b = false;
                        break;
                    }
                }

                if(b.equals(true)) {
                    System.out.println(sti);
                    break;
                }
                else {
                    sti++;
                    s = Integer.toString(sti);
                }
            }
            else {
                sti = sti + 1;
                s = Integer.toString(sti);
            }
        }
    }
}