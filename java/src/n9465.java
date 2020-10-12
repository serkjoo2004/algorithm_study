import java.util.Scanner;

public class n9465{
    static int num;
    static int [][] arr;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        for(int i=0; i<num; i++){
            int size = sc.nextInt();
            arr = new int [2][size];

            for(int j=0; j<2; j++){
                for(int k=0; k<size; k++) arr[j][k] = sc.nextInt();
            }

            if(size >= 2){
                arr[0][1] = arr[1][0] + arr[0][1];
                arr[1][1] = arr[0][0] + arr[1][1];

                for(int q = 2; q<size; q++){
                    arr[0][q] = Math.max(arr[1][q-1],arr[1][q-2]) + arr[0][q];
                    arr[1][q] = Math.max(arr[0][q-1],arr[0][q-2]) + arr[1][q];
                }
            }

            System.out.println(Math.max(arr[0][size-1], arr[1][size-1]));
        }
    }
}