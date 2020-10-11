import java.util.Scanner;

public class n8958{
    static int num;
    static String [] arr;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.nextLine();
        arr = new String[num];

        for(int i=0; i<num; i++){
            arr[i] = sc.nextLine();
        }

        for(int i=0; i<num; i++){
            int sum=1;
            int total = 0;
            if(arr[i].charAt(0) == 'O') total = 1;
            for(int j=1; j<arr[i].length(); j++){
                if(arr[i].charAt(j) == 'O'){
                    if(arr[i].charAt(j-1) =='O'){
                        sum=sum+1;
                    }
                    else{
                        sum = 1;
                    }
                    total = total + sum;
                }
            }
            System.out.println(total);
        }
    }
}