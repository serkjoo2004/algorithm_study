import java.util.ArrayList;
import java.util.Scanner;

public class n10871{
    static int num;
    static int [] arr;
    static int x;
    static ArrayList<Integer> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        x = sc.nextInt();

        arr = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }

        for(int i : arr){
            if (i < x) list.add(i);
        }

        for(int i : list){
            sb.append(i).append(' ');
        }

        System.out.println(sb);
        sc.close();
    }
}