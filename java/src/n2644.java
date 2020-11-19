import java.util.ArrayList;
import java.util.Scanner;

public class n2644{
    static int num;
    static int a, b;
    static int asize;
    static int [][] arr;
    static boolean [] check;
    static int cost = 0;
    static boolean solc;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();

        asize = sc.nextInt();
        arr = new int [asize][2];
        check = new boolean[asize];
        if(asize == 1){
            System.out.println(-1);
            return;
        }

        for(int i=0; i<asize; i++){
            for(int j=0; j<2; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        sol(a);
        if(!solc){
            System.out.println(-1);
        }
    }
    static void sol(int index){
        if(index == b){
            solc = true;
            System.out.println(cost);
            return;
        }

        for(int i=0; i<asize; i++){
            if(!check[i]){
                for(int j=0; j<2; j++){
                    if(arr[i][j] == index){
                        cost++;
                        check[i] = true;
                        if(j==0) {
                            list.add(arr[i][1]);
                            sol(arr[i][1]);
                        }
                        else{
                            list.add(arr[i][0]);
                            sol(arr[i][0]);
                        }

                    }
                }
            }
        }
        cost--;
    }
}
