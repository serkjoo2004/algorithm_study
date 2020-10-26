import java.util.ArrayList;
import java.util.Scanner;

class NHNPreTest1 {
    private static void solution(int numOfAllPlayers, int numOfQuickPlayers, char[] namesOfQuickPlayers, int numOfGames, int[] numOfMovesPerGame){
        // TODO: 이곳에 코드를 작성하세요. 추가로 필요한 함수와 전역변수를 선언해서 사용하셔도 됩니다.
        StringBuilder sb = new StringBuilder();

        char [] arr = new char [numOfAllPlayers-1];
        int [] cost = new int [numOfAllPlayers];
        cost[0] = 1;

        char alp = 66;
        for(int i=0; i<numOfAllPlayers-1; i++){
            arr[i] = Character.valueOf(alp) ;
            alp++;
        }

        ArrayList<Character> quickplayer = new ArrayList<>();
        for(char i : namesOfQuickPlayers){
            quickplayer.add(i);
        }

        for(int i=0; i<numOfGames; i++){
            while(numOfMovesPerGame[i] < 0){
                numOfMovesPerGame[i] = numOfMovesPerGame[i] + numOfAllPlayers -1;
            }
            numOfMovesPerGame[i] = numOfMovesPerGame[i]%(numOfAllPlayers-1);
        }

        char tagger = 'A';
        int start = 0;
        for(int i=0; i<numOfMovesPerGame.length; i++){
            if(!quickplayer.contains(arr[(start + numOfMovesPerGame[i])%(numOfAllPlayers-1)])){
                char tmp = tagger;
                tagger = arr[(start + numOfMovesPerGame[i])%(numOfAllPlayers-1)];
                arr[(start + numOfMovesPerGame[i])%(numOfAllPlayers-1)] = tmp;

            }
            start = (start + numOfMovesPerGame[i])%(numOfAllPlayers-1);
            cost[tagger - 65] ++;
        }

        for(char i : arr){
            sb.append(i).append(" ").append(cost[i-65]).append('\n');
        }
        sb.append(tagger).append(" ").append(cost[tagger-65]);

        System.out.println(sb);
    }

    private static class InputData {
        int numOfAllPlayers;
        int numOfQuickPlayers;
        char[] namesOfQuickPlayers;
        int numOfGames;
        int[] numOfMovesPerGame;
    }

    private static InputData processStdin() {
        InputData inputData = new InputData();

        try (Scanner scanner = new Scanner(System.in)) {
            inputData.numOfAllPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

            inputData.numOfQuickPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
            inputData.namesOfQuickPlayers = new char[inputData.numOfQuickPlayers];
            System.arraycopy(scanner.nextLine().trim().replaceAll("\\s+", "").toCharArray(), 0, inputData.namesOfQuickPlayers, 0, inputData.numOfQuickPlayers);

            inputData.numOfGames = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
            inputData.numOfMovesPerGame = new int[inputData.numOfGames];
            String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
            for(int i = 0; i < inputData.numOfGames ; i++){
                inputData.numOfMovesPerGame[i] = Integer.parseInt(buf[i]);
            }
        } catch (Exception e) {
            throw e;
        }

        return inputData;
    }

    public static void main(String[] args) throws Exception {
        InputData inputData = processStdin();

        solution(inputData.numOfAllPlayers, inputData.numOfQuickPlayers, inputData.namesOfQuickPlayers, inputData.numOfGames, inputData.numOfMovesPerGame);
    }
}