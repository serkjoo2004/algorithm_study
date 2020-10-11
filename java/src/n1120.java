import java.util.Scanner;

public class n1120 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int result = 0;

        for(int i=0;i<=b.length() - a.length(); i++){
            int temp = 0;
            for(int j=0; j<a.length(); j++){

                if(a.charAt(j) == (b.charAt(i+j))){
                    temp = temp + 1;
                }
            }
            if (temp > result) result = temp;
        }
        System.out.println(a.length()-result);
    }
}