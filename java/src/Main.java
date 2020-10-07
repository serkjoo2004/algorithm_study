import java.util.Scanner;

public class Main{
    static int length;
    static int [] arr;
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();

        arr = new int[101];
        arr[1] = 9;
        arr[2] = 17;

        for (int i = 3; i <= length; i++) {
            arr[i] = arr[i - 1] * 2 - 2;
        }

        System.out.println(arr[length]%1000000000);
    }
}

