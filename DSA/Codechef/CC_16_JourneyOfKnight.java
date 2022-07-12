package DSA.Codechef;

import java.util.Scanner;

public class CC_16_JourneyOfKnight {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases > 0){
            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();
            int X2 = sc.nextInt();
            int Y2 = sc.nextInt();
            boolean [] [] board = new boolean[8][8];
            if(knight(board,X1-1,Y1-1,X2-1,Y2-1,0)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            testcases--;
        }
    }

    static boolean knight(boolean [] [] board, int row1, int column1, int row2, int column2, int moves){
        if(row1 == row2 && column1 == column2){
            if(moves%2 == 0) {
                return true;
            }else{
                return false;
            }
        }
        if(moves > 100){
            return false;
        }
        board[row1][column1] = true;

//          Left check
        if(isValid(board,row1+1,column1-2)){
            if(!board[row1+1][column1-2]){
                if(knight(board,row1+1,column1-2,row2,column2,moves+1)){
                    return true;
                }
                board[row1][column1] = false;
            }
        }

        if(isValid(board,row1-1,column1-2)){
            if(!board[row1-1][column1-2]){
                if(knight(board,row1-1,column1-2,row2,column2,moves+1)){
                    return true;
                }
            }
        }
//                  Right check
        if(isValid(board,row1+1,column1+2)){
            if(!board[row1+1][column1+2]){
                if(knight(board,row1+1,column1+2,row2,column2,moves+1)){
                    return true;
                }
            }
        }

        if(isValid(board,row1-1,column1+2)){
            if(!board[row1-1][column1+2]){
                if(knight(board,row1-1,column1+2,row2,column2,moves+1)){
                    return true;
                }
            }
        }

//        Up check
        if(isValid(board,row1-2,column1+1)){
            if(!board[row1-2][column1+1]){
                if(knight(board,row1-2,column1+1,row2,column2,moves+1)){
                    return true;
                }
            }
        }
        if(isValid(board,row1-2,column1-1)){
            if(!board[row1-2][column1-1]){
                if(knight(board,row1-2,column1-1,row2,column2,moves+1)){
                    return true;
                }
            }
        }


//        Down check
        if(isValid(board,row1+2,column1+1)){
            if(!board[row1+2][column1+1]){
                if(knight(board,row1+2,column1+1,row2,column2,moves+1)){
                    return true;
                }
            }
        }
        if(isValid(board,row1+2,column1-1)){
            if(!board[row1+2][column1-1]){
                if(knight(board,row1+2,column1-1,row2,column2,moves+1)){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean isValid(boolean[][] board, int row , int column){
        return row >= 0 && row < board.length && column >= 0 && column < board[0].length;
    }
}
