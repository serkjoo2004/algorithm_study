import java.util.Scanner;

public class n11057{
    static int length;
    static int [][] arr;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        int result = 0;

        arr = new int [length+1][10];

        for(int i=0; i<10; i++) arr[1][i] = 1;

        for(int i=2; i<=length; i++){
            for(int j=0; j<10; j++){
                for(int k=j; k>=0;k--){
                    arr[i][j] = (arr[i][j] + arr[i-1][k])%10007;
                }
            }
        }
        for(int i : arr[length]) result = (result + i) % 10007;

        System.out.println(result);
    }
}