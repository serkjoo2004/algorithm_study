import java.util.Scanner;

public class n10844{
    static int length;
    static int [][] arr;
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();

        arr = new int[101][10];

        for(int i=1; i<10; i++) arr[1][i] = 1;

        for(int i=2; i<=length; i++){
            for(int j=0; j<10; j++){
                if(j==0){
                    arr[i][j] = arr[i-1][1]%1000000000;
                }
                else if(j==9){
                    arr[i][j] = arr[i-1][8]%1000000000;
                }
                else{
                    arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1])%1000000000;
                }
            }
        }

        int result =0;
        for(int i: arr[length]){
            result = (result + i)%1000000000;
        }
        System.out.println(result);
    }
}