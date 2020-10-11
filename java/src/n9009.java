import java.util.ArrayList;
import java.util.Scanner;

public class n9009{
    static int num;
    static int [] arr;
    static int [] fib;
    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer> list;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        arr = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }

        fib = new int [46];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2; i<fib.length; i++){
            fib[i] = fib[i-2] + fib[i-1];
        }


        for(int i:arr){
            list = new ArrayList<>();
            sol(i);
        }

        System.out.println(sb);
        sc.close();


    }

    static void sol(int v){
        if (v == 0){
            for(int i=list.size()-1; i>=0; i--){
                sb.append(list.get(i)).append(" ");
            }
            sb.append("\n");
            return;
        }

        int i=0;
        while(fib[i]<=v){
            i++;
        }

        list.add(fib[i-1]);
        sol(v-fib[i-1]);
    }
}