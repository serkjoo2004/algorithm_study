import java.util.Scanner;

public class n2156{
    static int num;
    static int [] arr;
    static int [] dp;
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        arr = new int[num];
        dp = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }

        dp[0] = arr[0];
        if(num == 1){
            System.out.println(arr[0]);
        }
        else if(num == 2){
            System.out.println(arr[0]+arr[1]);
        }
        else{
            dp[0] = arr[0];
            dp[1] = dp[0] + arr[1];
            dp[2] = Math.max(arr[1]+arr[2],Math.max(dp[1],arr[0]+arr[2]));

            for(int i=3; i<num; i++){
                dp[i] = Math.max(Math.max(dp[i-1],dp[i-2]+arr[i]),dp[i-3]+arr[i-1]+arr[i]);
            }

            System.out.println(dp[num-1]);
        }
    }
}