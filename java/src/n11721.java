import java.util.Scanner;

public class n11721{
    static String s;
    static StringBuilder sb = new StringBuilder();

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        for(int i=1; i<s.length()+1; i++){
            sb.append(s.charAt(i-1));
            if(i % 10 == 0) sb.append("\n");
        }
        System.out.println(sb);
    }
}
