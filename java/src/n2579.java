import java.util.Scanner;

public class n2579{
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
        }

        cost[0] = arr[0];

        if(num==1){
            System.out.println(arr[0]);
            return;
        }
        else if(num==2){
            System.out.println(arr[0]+arr[1]);
            return;
        }
        else if(num==3){
            System.out.println(Math.max(Math.max(arr[0]+arr[1],arr[1]+arr[2]),arr[0]+arr[2]));
            return;
        }

        cost[0] = arr[0];
        cost[1] = cost[0] + arr[1];
        cost[2] = Math.max(cost[0]+arr[2],arr[1]+arr[2]);

        for(int i=3; i<num; i++){
            cost[i] = Math.max(cost[i-2]+ arr[i],cost[i-3]+arr[i-1]+arr[i]);
        }

        System.out.println(cost[num-1]);
        sc.close();
    }
}