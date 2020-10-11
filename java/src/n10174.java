import java.util.ArrayList;
import java.util.Scanner;

public class n10174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int num = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<num; i++){
            String st = sc.nextLine();
            list.add(st.toLowerCase());
        }

        for(int i=0; i<num; i++){
            String s = list.get(i);
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<s.length(); j++){
                sb.append((s.charAt(s.length()-j-1)));
            }

            if(sb.toString().equals(s)) {
                list.set(i,"Yes");
            }
            else {
                list.set(i,"No");
            }
        }

        for(int i=0; i<list.size();i++) System.out.println(list.get(i));
    }
}