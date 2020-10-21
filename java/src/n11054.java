import java.util.Scanner;

public class n11054{
    static int num;
    static int [] arr;
    static int [] up;
    static int [] down;
    static int [] cost;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        arr = new int[num];
        up = new int[num];
        down = new int[num];
        cost = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
            up[i] = 1;
            down[i] = 1;
        }

        for(int i=0; i<num; i++){
            int max = 0;
            for(int j=i; j>=0; j--){
                if(arr[j] < arr[i] && max < up[j]){
                    max = up[j];
                }
            }
            up[i] = max + 1;
        }

        for(int i=num-2; i>=0; i--){
            int max = 0;
            for(int j=i+1; j<num; j++){
                if(arr[j] < arr[i] && max < down[j]){
                    max = down[j];
                }
            }
            down[i] = max + 1;
        }

        int max = 0;
        for(int i=0; i<num; i++){
            cost[i] = up[i] + down[i] - 1;
            max = Math.max(max,cost[i]);
        }

        System.out.println(max);
    }
}