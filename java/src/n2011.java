import java.util.Scanner;

public class n2011{
    static String num;
    static long [] cost;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        num = sc.nextLine();
        int mod = 1000000;
        cost = new long[num.length() + 1];

        cost[0] = cost[1] = 1;


        if(num.charAt(0) == '0'){
            System.out.println(0);
            return;
        }


        for(int i=2; i<=num.length(); i++){
            if(num.charAt(i-1) > '0'){
                cost[i] = cost[i-1];
            }
            int temp = (num.charAt(i-2) -'0')*10 + num.charAt(i-1) -'0';
            if(temp>=10 && temp<=26){
                cost[i] = (cost[i] + cost[i-2]) % mod;
            }
        }



        System.out.println(cost[cost.length-1]);
    }
}