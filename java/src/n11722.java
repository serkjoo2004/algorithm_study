import java.util.Scanner;

public class n11722{
    static int num;
    static int arr [];
    static int cost [];

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        arr = new int [num];
        cost = new int [num];

        for (int i=0; i<num; i++){
            arr[i] = sc.nextInt();
            cost[i] = 1;
        }

        for(int i=0; i<num; i++){
            int max = 0;
            for(int j=i; j>=0; j--){
                if(arr[j] > arr[i] && max < cost[j]){
                    max = cost[j];
                }
            }
            cost[i] = max + 1;
        }

        int result = 0;
        for(int i : cost){
            result = Math.max(result,i);
        }

        System.out.println(result);
    }
}
