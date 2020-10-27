//모든 원소가 '0' 또는 '1'인 행렬
//'1'로 표시된 원소는 영역을 나타내며, 상하좌우로 인접한 원소가 '1'이면 같은 영역
//영역의 크기는 '1'로 표시된 원소의 개수
//입력 : 행렬의 크기 n, n*n 행렬
//출력 : 영역의 개수, 각 영역의 크기
//NHN Pre-Test 1차 모의 시험

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

class PreTest {
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