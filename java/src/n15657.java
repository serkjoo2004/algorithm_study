import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class n15657{
    static int num, count;
    static ArrayList<Integer> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    static int [] arr;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        count = sc.nextInt();
        arr = new int[count];

        for(int i=0; i<num; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        sol(0);
        System.out.println(sb);
    }

    static void sol(int r){
        if(r==count){
            for(int i=1;i<count;i++){
                if(!(arr[i-1]<=arr[i])) return;
            }
            for(int i: arr){
                sb.append(i).append(" ");
            }
            sb.append("\n");
        }
        else{
            for(int i=0; i<num; i++){
                arr[r] = list.get(i);
                sol(r+1);
            }
        }
    }
}