import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class n15663{
    static int num, count;
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<String> slist = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    static int [] arr;
    static boolean [] check;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        count = sc.nextInt();
        arr = new int[count];
        check = new boolean[num];

        for(int i=0; i<num; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        sol(0);
        System.out.println(sb);
        sc.close();
    }
    static void sol(int r){
        if (r==count){
            StringBuilder chk = new StringBuilder();
            for(int i : arr){
                chk.append(i).append(" ");
            }
            if(slist.contains(chk.toString())) return;
            slist.add(chk.toString());
            for(int i : arr){
                sb.append(i).append(" ");
            }
            sb.append("\n");
        }
        else{
            for(int i=0; i<num; i++){
                if(!(check[i])){
                    check[i] = true;
                    arr[r] = list.get(i);
                    sol(r+1);
                    check[i] = false;
                }
            }
        }
    }
}