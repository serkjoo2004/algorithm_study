import java.util.Scanner;

public class n11727{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int [] arr = new int [1001];
        arr[0] = 1;
        arr[1] = 1;

        for(int i=2; i<=1000;i++){
            arr[i] = ((arr[i-2] * 2) + arr[i-1]) % 10007;
        }

        System.out.println(arr[sc.nextInt()]);
    }
}