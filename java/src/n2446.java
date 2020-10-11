import java.util.Scanner;

public class n2446{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            for(int j=0; j<i; j++) sb.append(' ');
            int k=0;
            while(k<2*(num-i)-1) {
                sb.append('*');
                k++;
            }
            sb.append('\n');
        }

        for(int i=1; i<num; i++){
            for(int j=0; j<num-i-1; j++) sb.append(' ');
            for(int k=0; k<2*(i+1)-1; k++) sb.append('*');
            sb.append('\n');
        }

        sc.close();
        System.out.println(sb);
    }
}