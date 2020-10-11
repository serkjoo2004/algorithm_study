import java.util.Scanner;

public class n2445{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        char [] arr = new char[2*num];

        for(int i=0; i<arr.length; i++) arr[i] = ' ';

        for(int i=0; i<num; i++){
            arr[i] = '*';
            arr[arr.length-1-i] = '*';
            sb.append(arr).append('\n');
        }
        for(int i=1; i<num; i++){
            arr[num-i] = ' ';
            arr[num+i-1] = ' ';
            sb.append(arr).append('\n');
        }

        sc.close();
        System.out.println(sb);
    }
}