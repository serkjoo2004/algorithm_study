import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class n15654 {
    static int num,count;
    static ArrayList<Integer> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    static boolean [] check;
    static int [] arr;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        count = sc.nextInt();

        arr = new int[count];

        for(int i=0;i<num;i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        check = new boolean[1+list.get(list.size()-1)];

        sol(0);
        System.out.println(sb);
    }

    static void sol(int r){
        if(r == count){
            for(int i : arr){
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i : list){
            if(!check[i]){
                check[i] = true;
                arr[r] = i;
                sol(r+1);
                check[i] = false;
            }
        }
    }
}