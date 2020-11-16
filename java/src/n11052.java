import java.util.Scanner;

public class n11052{
    static int num;
    static int[] arr;
    static int [] cost;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        arr = new int[num+1];
        cost = new int[num+1];

        for(int i=1; i<num+1; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<num+1; i++){
            cost[i] = arr[i];
            for(int j=1; j<i; j++){
                cost[i] = Math.max(cost[i],cost[i-j]+cost[j]);
            }
        }

        System.out.println(cost[num]);
    }
}

