import java.util.Scanner;

public class n11720{
    static int count;
    static String num;
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        sc.nextLine();
        num = sc.nextLine();

        int result = 0;

        for(int i=0; i<num.length();i++){
            result = result + Character.getNumericValue(num.charAt(i));
        }
        System.out.println(result);
    }
}