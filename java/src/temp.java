import java.util.ArrayList;
import java.util.Scanner;

public class temp{
    static String num;
    static boolean [] check;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        num = sc.next();
        check = new boolean[num.length()-1];

        ArrayList<Integer> list = new ArrayList<>();


        if((int) num.charAt(0) <= 48 || (int) num.charAt(0) >=58){
            System.out.println(0);
            return;
        }

        if(num.length() == 1){
            System.out.println(1);
            return;
        }

        if(Character.getNumericValue(num.charAt(0))==1 && Character.getNumericValue(num.charAt(1)) != 0){
            list.add(2);
            check[0] = true;
        }
        else if(Character.getNumericValue(num.charAt(0))==2 && Character.getNumericValue(num.charAt(1))<=6 && Character.getNumericValue(num.charAt(1)) >= 1){
            list.add(2);
            check[0] = true;
        }
        else list.add(1);

        for(int i=1; i<num.length()-1; i++){
            if((int) num.charAt(0) <= 47 || (int) num.charAt(0) >=58){
                System.out.println(0);
                return;
            }
            else if(Character.getNumericValue(num.charAt(i))==1 && Character.getNumericValue(num.charAt(i+1)) != 0 && !check[i-1]){
                list.add(2);
                check[i] = true;
            }
            else if(Character.getNumericValue(num.charAt(i))==1 && Character.getNumericValue(num.charAt(i+1)) != 0 &&  check[i-1]){
                list.set(list.size()-1,(list.get(list.size()-1) * 2 -1)%1000000);
                check[i] = true;
            }
            else if(Character.getNumericValue(num.charAt(i))==2 && Character.getNumericValue(num.charAt(i+1)) != 0 && Character.getNumericValue(num.charAt(i+1))<=6 && !check[i-1]){
                list.add(2);
                check[i] = true;
            }
            else if(Character.getNumericValue(num.charAt(i))==2 && Character.getNumericValue(num.charAt(i+1)) != 0 && Character.getNumericValue(num.charAt(i+1))<=6 && check[i-1]){
                list.set(list.size()-1,(list.get(list.size()-1) * 2 -1)%1000000);
                check[i] = true;
            }
            else if(Character.getNumericValue(num.charAt(i))==0 && Character.getNumericValue(num.charAt(i+1))==0){
                System.out.println(0);
                return;
            }
            else if(check[i-1] && Character.getNumericValue(num.charAt(i+1))==0){
                if(Character.getNumericValue(num.charAt(i-1)) == 1){
                    list.set(list.size()-1,list.get(list.size()-1) / 2);
                }
                else{
                    list.set(list.size()-1,(list.get(list.size()-1)+1) / 2);
                }
            }
            else if(Character.getNumericValue(num.charAt(i))==0 && Character.getNumericValue(num.charAt(i-1)) >=3){
                System.out.println(0);
                return;
            }
        }

        if((int) num.charAt(num.length()-1) <= 47 || (int) num.charAt(num.length()-1) >=58){
            System.out.println(0);
            return;
        }
        if(Character.getNumericValue(num.charAt(num.length()-1))==0 && Character.getNumericValue(num.charAt(num.length()-2)) >=3){
            System.out.println(0);
            return;
        }

        long result = 1;
        for(int i : list){
            result = (result * i)%1000000;
        }

        System.out.println(result);
    }
}
