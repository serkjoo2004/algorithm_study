import java.util.Scanner;

public class n2133{
    static int num;
    static int [] arr;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        arr = new int[31];
        arr[2] = 3;

        for(int i=4; i<=num+1; i=i+2){
            int temp = 0;
            for(int j=i-4;j > 0; j=j-2){
                temp = temp + arr[j]*2;
            }

            arr[i] = arr[i-2]*3 + temp + 2;
        }
        System.out.println(arr[num]);
    }
}