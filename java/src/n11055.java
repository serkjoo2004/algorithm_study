import java.util.Scanner;

public class n11055{
    static int num;
    static int [] arr;
    static int [] sum;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        arr = new int [num];
        sum = new int [num];

        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
            sum[i] = arr[i];
        }


        sum[0] = arr[0];
        for(int i=1; i<num; i++){
            int temp = 0;
            for(int j=i-1; j>=0; j--){
                if(arr[j]<arr[i] && temp < sum[j]) {
                    temp = sum[j];
                }
            }
            sum[i] = arr[i] + temp;
        }

        int max = 0;
        for(int i : sum){
            if(max < i) max = i;
        }

        System.out.println(max);
    }
}