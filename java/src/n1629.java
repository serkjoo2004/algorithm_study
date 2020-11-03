import java.util.Scanner;

public class n1629{
    static int A,B,C;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        long temp = A % C;
        long ans = 1;
        while(B>1){
            if(B%2 == 1){
                ans = (ans * (temp%C))%C;
            }
            temp = (temp * temp) % C;
            B = B/2;
        }

        System.out.println(((ans)*temp)%C);
    }
}
