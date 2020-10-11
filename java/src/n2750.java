import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class n2750 {
    public static void main(String[] args) {
        int num;

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();


        Scanner sc=new Scanner(System.in);
        num = sc.nextInt();

        for (int i=0; i<num; i++){
            list.add(sc.nextInt());
        }

        for (int i=0; i<num; i++){
            if(!list2.contains(list.get(i))){
                list2.add(list.get(i));
            }
        }

        Collections.sort(list2);

        for(int i=0; i<list2.size();i++){
            System.out.println(list2.get(i));
        }
    }
}
