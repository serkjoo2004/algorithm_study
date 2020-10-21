import java.util.Scanner;

public class n1912{
    static int num;
    static int [] arr;
    static int [] cost;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        arr = new int [num];
        cost = new int [num];

        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
            cost[i] = arr[i];
        }

        for(int i=1; i<num; i++){
            cost[i] = Math.max(cost[i-1]+cost[i],cost[i]);
        }

        int result = cost[0];
        for(int i : cost){
            result = Math.max(result, i);
        }

        System.out.println(result);
    }
}