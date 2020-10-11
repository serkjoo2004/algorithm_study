import java.util.Scanner;

public class n2839{
    static int n;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int tmp = n;
        int f = n/5;

        while(f>=0){
            tmp = n - 5*f;
            if(tmp%3 == 0) {
                System.out.println(f + tmp/3);
                return;
            }
            f--;
        }

        if(n%3 == 0) System.out.println(n/3);
        else System.out.println(-1);
    }
}