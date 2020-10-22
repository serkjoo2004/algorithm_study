import java.util.Scanner;

public class n1699{
    static int num;
    static int [] arr;
    static int [] cost;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        arr = new int [num+1];
        cost = new int [num+1];

        arr[1] = 1;

        for(int i=2; i<=num; i++){
            arr[i] = arr[i-1] + 1;
            for(int j=2; j*j<=i; j++){
                if(arr[i] > arr[i-j*j] + 1 )
                    arr[i] = arr[i-j*j] + 1;
            }
        }

        System.out.println(arr[num]);
    }
}

