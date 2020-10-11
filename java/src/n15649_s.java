import java.util.Scanner;

public class n15649_s {
    static int n,m;
    static int arr [];
    static boolean check [];
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int num){
        if(num == m){
            for(int i : arr){
                sb.append(i+" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=1; i<=n; i++){
            if(!check[i]){
                check[i] = true;
                arr[num] = i;
                dfs(num+1);
                check[i] = false;
            }
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int [m];
        check = new boolean[n+1];

        dfs(0);
        System.out.println(sb);
        sc.close();
    }
}
