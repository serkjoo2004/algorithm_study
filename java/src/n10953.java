import java.util.Scanner;

public class n10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String s = sc.next();
            System.out.println(s.charAt(0)+s.charAt(2)-'0'-'0');
        }
    }
}