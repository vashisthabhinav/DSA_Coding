package DSA.Recursions;

import java.util.ArrayList;

public class B_23_Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        path("",3,3);
        System.out.println(pathList("",3,3));
        System.out.println(pathDiagonal("",3,3));
        boolean[][] maze = new boolean[][]{
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathWithObstacles("",maze,0,0);
    }
    public static int count(int row, int col){
        if (row==1 || col==1){
            return 1;
        }
        int left = count(row- 1, col);
        int right = count(row, col - 1);
        return left + right;
    }
    public static void path(String processed, int row , int col){
        if (row==1 && col==1){
            System.out.println(processed);
            return;
        }
        if (row>1) path(processed + 'D',row - 1, col);
        if (col>1) path(processed + 'R', row, col - 1);
    }
    public static ArrayList<String> pathList(String processed, int row , int col){
        if (row==1 && col==1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(processed);
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (row>1) ans.addAll(pathList(processed + 'D',row - 1, col));
        if (col>1) ans.addAll(pathList(processed + 'R', row, col - 1));
        return ans;
    }
    public static ArrayList<String> pathDiagonal(String processed, int row , int col){
        if (row==1 && col==1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(processed);
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (row>1) ans.addAll(pathDiagonal(processed + 'V',row - 1, col));//Vertical
        if (row>1 && col>1) ans.addAll(pathDiagonal(processed + 'D',row - 1, col-1));//Diagonal
        if (col>1) ans.addAll(pathDiagonal(processed + 'H', row, col - 1));//Horizontal
        return ans;
    }
    public static void pathWithObstacles(String processed, boolean[][]maze, int row , int col){
        if (row== maze.length-1 && col== maze[0].length-1 ){
            System.out.println(processed);
            return;
        }
        if (!maze[row][col]) return;
        if (row < maze.length-1) pathWithObstacles(processed + 'D',maze,row + 1, col);
        if (col < maze[0].length-1) pathWithObstacles(processed + 'R',maze, row, col + 1);
    }
}
