import java.util.Scanner;

public class n9095{
    static int num;
    static int [] arr;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        arr = new int[11];

        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for(int i=4; i<=10; i++){
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }

        int [] q = new int [num];
        for(int i=0; i<num; i++){
            q[i] = sc.nextInt();
        }

        for(int i : q) System.out.println(arr[i]);
    }
}