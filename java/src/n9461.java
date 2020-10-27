import java.util.Scanner;

public class n9461{
    static int num;
    static int [] q;
    static long [] cost;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        cost = new long [101];

        num = sc.nextInt();
        q = new int[num];
        for(int i=0; i<num; i++){
            q[i] = sc.nextInt();
        }

        cost[1] = 1;
        cost[2] = 1;
        cost[3] = 1;
        cost[4] = 2;
        cost[5] = 2;
        cost[6] = 3;
        cost[7] = 4;

        for(int i=8; i<=100; i++){
            cost[i] = cost[i-1] + cost[i-5];
        }

        for(int i=0; i<num; i++){
            System.out.println(cost[q[i]]);
        }
    }
}