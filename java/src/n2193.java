import java.util.Scanner;

public class n2193{
    static int num;
    static long [][] arr;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        arr = new long[num+1][2];

        arr[1][1] = 1;

        for(int i=2; i<=num; i++){
            arr[i][0] = arr[i-1][0] + arr[i-1][1];
            arr[i][1] = arr[i-1][0];
        }

        System.out.println(arr[num][0] + arr[num][1]);
    }
}