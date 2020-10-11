import java.util.Scanner;

public class n1463{
    static int num;
    static int [] arr;
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        arr = new int [num+1];

        for(int i=2; i<=num; i++){
            arr[i] = arr[i-1]+1;
            if(i%3 == 0){
                if(arr[i] > (arr[i/3]+1)) arr[i] = (arr[i/3]+1);
            }
            if(i%2 == 0){
                if(arr[i] > (arr[i/2]+1)) arr[i] = (arr[i/2]+1);
            }
        }

        System.out.println(arr[num]);
    }
}