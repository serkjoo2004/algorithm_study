import java.util.Scanner;

public class n2225{
    static int num;
    static int k;
    static int [][] arr;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        k = sc.nextInt();
        arr = new int [num+1][k+1];

        for(int i=1; i<k+1; i++){
            arr[1][i] = i;
        }


        for(int i=1; i<num+1; i++){
            arr[i][1] = 1;
        }

        for(int i=2; i<num+1; i++){
            for(int j=2; j<k+1; j++){
                arr[i][j] = (arr[i][j-1] + arr[i-1][j]) % 1000000000;
            }
        }

        System.out.println(arr[num][k]);
    }
}
