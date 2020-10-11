import java.util.ArrayList;
import java.util.Scanner;

public class n10950 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(a+b);
        }

        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}