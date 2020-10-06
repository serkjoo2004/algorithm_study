package com.company;

import java.util.Scanner;

public class n1924{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        String [] day = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT","SUN"};


        int count =0;
        for(int i=1;i<m;i++){
            if(i==1 ||i==3||i==5||i==7||i==8||i==10||i==12){
                count=count+31;
            }
            else if(i==4 ||i==6||i==9||i==11){
                count=count+30;
            }
            else{
                count=count+28;
            }
        }

        for(int i=0;i<d;i++){
            count++;
        }

        System.out.println(day[((count%7)+6)%7]);
    }
}
