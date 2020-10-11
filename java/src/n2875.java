import java.util.Scanner;

public class n2875{
    static int n, m, k;
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        int t = 0;
        int gap = 0;

        if(n+m-k < 3){
            System.out.println(0);
            return;
        }

        if(n>=m){
            if((n/2)<=m) t = n/2;
            else t = m;
        }
        else t = n/2;

        gap = n+m - (3*t);

        if(gap >= k){
            System.out.println(t);
        }
        else{
            System.out.println(t - (k-gap-1)/3 -1);
        }
    }
}