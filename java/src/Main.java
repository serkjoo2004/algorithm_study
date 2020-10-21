import java.util.Scanner;

public class Main{
    static int num;
    static int arr [];
    static int cost [];
    static int max;
    static int temp;
    static boolean positive;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        arr = new int [num];
        cost = new int [num];

        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<num; i++){
            max = 0;
            temp = 0;
            searchdown(i);
            searchup(i+1);
            cost[i] = max;
        }

        for(int i : arr){
            if(i >= 0){
                positive = true;
            }
        }

        if(!positive){
            int result = arr[0];
            for(int i=1; i<num; i++){
                result = Math.max(result,arr[i]);
            }
            System.out.println(result);
            return;
        }

        int result = 0;
        for(int i: cost){
            result = Math.max(result,i);
        }
        System.out.println(result);
        sc.close();
    }

    static void searchdown(int index){
        if(index < 0) return;

        temp = temp + arr[index];

        if(temp > 0){
            max = max + temp;
            temp = 0;
        }

        searchdown(index-1);
    }
    static void searchup(int index){
        if(index >= num) return;

        temp = temp + arr[index];

        if(temp > 0){
            max = max + temp;
            temp = 0;
        }

        searchup(index+1);
    }
}

//10 -4 3 1 5 6 -35 12 21 -1
//10 6 9 10 15 21 -24 -12 9 8 => 21
