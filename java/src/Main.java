import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

class Main {
    static boolean [][] check;
    static int size;
    static StringBuilder sb = new StringBuilder();

    private static void solution(int sizeOfMatrix, int[][] matrix) {
        // TODO: 이곳에 코드를 작성하세요.
        int result = 0;
        ArrayList<Integer> list = new ArrayList<>();


        check = new boolean [sizeOfMatrix][sizeOfMatrix];
        for(int i=0; i<sizeOfMatrix; i++){
            for(int j=0; j<sizeOfMatrix; j++){
                if(matrix[i][j] == 1) check[i][j] = true;
            }
        }

        for(int i=0; i<sizeOfMatrix; i++){
            for(int j=0; j<sizeOfMatrix; j++){
                size = 0;
                search(i,j,sizeOfMatrix);
                if(size > 0){
                    result++;
                    list.add(size);
                }
            }
        }
        System.out.println(result);
        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            if(i==list.size()-1) sb.append(list.get(i));
            else sb.append(list.get(i)).append(" ");
        }

        System.out.println(sb);
    }

    private static void search(int i,int j, int s){
        if(0<=i && i<s && 0<=j && j<s){
            if(check[i][j]){
                size ++;
                check[i][j] = false;
                search(i,j-1,s);
                search(i-1,j,s);
                search(i,j+1,s);
                search(i+1,j,s);
            }
        }
    }


    private static class InputData {
        int sizeOfMatrix;
        int[][] matrix;
    }

    private static InputData processStdin() {
        InputData inputData = new InputData();

        try (Scanner scanner = new Scanner(System.in)) {
            inputData.sizeOfMatrix = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

            inputData.matrix = new int[inputData.sizeOfMatrix][inputData.sizeOfMatrix];
            for (int i = 0; i < inputData.sizeOfMatrix; i++) {
                String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
                for (int j = 0; j < inputData.sizeOfMatrix; j++) {
                    inputData.matrix[i][j] = Integer.parseInt(buf[j]);
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return inputData;
    }

    public static void main(String[] args) throws Exception {
        InputData inputData = processStdin();

        solution(inputData.sizeOfMatrix, inputData.matrix);
    }
}