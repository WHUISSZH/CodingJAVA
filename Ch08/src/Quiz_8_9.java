import java.util.Scanner;

public class Quiz_8_9 {
    void printResult(){
        char [][] board = new char[3][3];
        displayBoard(board);

        while (true){
            //prompt the first player
            //放置棋子
            makeAMove(board, 'X');

            //打印放置棋子后的棋盘
            displayBoard(board);
            //判断是否存在输赢
            if (isWon('X', board)){
                System.out.println("X is won");
                System.exit(1);
            }else if (isDraw(board)){
                System.out.println("No winner");
                System.exit(2);
            }

            //如果没有输赢，到下一位玩家操作
            makeAMove(board, 'O');
            displayBoard(board);
            if (isWon('O', board)){
                System.out.print("O is won");
                System.exit(3);
            }else if (isDraw(board)){
                System.out.println("No winner");
                System.exit(4);
            }
        }
    }

    /**
     * 打印棋盘
     * @param board
     */
    private static void displayBoard(char[][] board){
        System.out.println("\n---------------");

        for (int i = 0; i < 3; i++){
            System.out.print(" | ");
            for (int j = 0; j < 3; j++){
                System.out.print(board[i][j] != '\u0000' ? board[i][j] + " | " : "  | ");
            }
            System.out.println("\n---------------");
        }
    }

    /**
     * 落子
     * @param board 棋盘位置数组
     * @param player 玩家姓名，也就是 X 与 O
     */
    private static void makeAMove(char[][] board, char player){
        Scanner input = new Scanner(System.in);
        boolean done = false;

        do {
            System.out.printf("Enter a row for player %c : ", player);
            int row = input.nextInt();
            System.out.printf("Enter a column for player %c : ", player);
            int column = input.nextInt();

            if (board[row][column] == '\u0000'){
                board[row][column] = player;
                done = true;
            }else{
                System.out.print("This cell is already occupied. Try a different cell");
            }
        }while (!done);
    }

    /**
     * 检查是否3个元素可连成一线
     * @param ch 棋子种类，其实就是玩家名
     * @param board 棋盘，存储着每行每列的落子情况
     * @return
     */
    private static boolean isWon(char ch, char[][] board){
        //Check rows
        for (int i = 0; i < 3; i++){
            if (ch == board[i][0] && ch == board[i][1] && ch == board[i][2]){
                return true;
            }
        }

        //Check columns
        for (int i = 0; i < 3; i++){
            if (ch == board[0][i] && ch == board[1][i] && ch == board[2][i]){
                return true;
            }
        }

        //Check major diagonal
        if (ch == board[0][0] && ch == board[1][1] && ch == board[2][2]){
            return true;
        }

        //Check sub diagonal
        if (ch == board[0][2] && ch == board[1][1] && ch == board[2][0]){
            return true;
        }

        return false;
    }

    /**
     * 判断棋盘是否被占满
     * @param board 存储了棋子分布情况的数组
     * @return true 表明棋盘被占满
     */
    private static boolean isDraw(char[][] board){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j <3; j++){
                if (board[i][j] == '\u0000'){
                    return false;
                }
            }
        }
        //All cells are now occupied
        return true;
    }
}