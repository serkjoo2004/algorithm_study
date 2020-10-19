import java.util.Scanner;

public class n11053{
    static int num;
    static int [] arr;
    static int [] length;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        arr = new int [num];
        length = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
            length[i] = 1;
        }

        for(int i=1; i<num; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[i] > arr[j] && length[i]<=length[j]){
                    length[i] = length[j]+1;
                }
            }
        }

        int result = length[0];
        for(int i=1; i<num; i++){
            if(length[i]>result) result = length[i];
        }

        System.out.println(result);
    }
}