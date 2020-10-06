package com.company;

import java.util.*;

public class n1260 {
    static int point;
    static int line;
    static int start;
    static ArrayList<Integer>[] list;
    static boolean check [];
    static StringBuilder sb = new StringBuilder();


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        point = sc.nextInt();
        line = sc.nextInt();
        start = sc.nextInt();

        list = new ArrayList[point+1];

        for (int i = 1; i < list.length; i++) {
            list[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<line; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }

        for(int i=1; i<list.length; i++) Collections.sort(list[i]);

        check = new boolean[point+1];

        dfs(start);
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);

        sb.delete(0,sb.length());

        check = new boolean[point+1];
        bfs(start);


    }

    static void dfs(int n){
        if(check[n]){
            return;
        }

        check[n] = true;
        sb.append(n + " ");

        for(int i : list[n]){
            dfs(i);
        }
    }

    static void bfs(int n){
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(n);
        check[n] = true;


        while(!queue.isEmpty()){
            int x = queue.poll();
            sb.append(x+" ");
            for(int i: list[x]){
                if(!check[i]){
                    check[i] = true;
                    queue.offer(i);
                }
            }
        }

        System.out.println(sb);

    }
}