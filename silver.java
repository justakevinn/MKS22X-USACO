import java.util.*;
import java.io.*;


public class silver{
  File text;
  Scanner in;
  int rows;
  int cols;
  int time;
  int startr;
  int startc;
  int endr;
  int endc;
  int[][] moves = {{0,1}, {0,-1}, {1,0}, {-1, 0}};
  String s = "";
  char[][] board;
    public silver(String filename){


    try{
      text = new File(filename);
      in = new Scanner(text);
      rows = in.nextInt();
      cols = in.nextInt();
      time = in.nextInt();
      in.nextLine();
      String path = "";
      while(in.hasNextLine()){
        path = in.nextLine();
        s += path;
      }
      int index = 0;
      board = new char[rows][cols];
      for(int r = 0; r < rows; r++){
        for(int c = 0; c < cols; c++){
          board[r][c] = s.charAt(index);
          index++;
        }
      }
      String[] nums = path.split(" ");
      startr = Integer.parseInt(nums[0]) - 1;
      startc = Integer.parseInt(nums[1]) - 1;
      endr = Integer.parseInt(nums[2]) - 1;
      endc = Integer.parseInt(nums[3]) - 1;
    }
    catch(FileNotFoundException e){}
    }


    public int cTravel(){
    int[][] current = new int[rows][cols];
    int[][] previous = new int[rows][cols];
    for(int r = 0; r < rows; r++){
      for(int c = 0; c < cols; c++){
        if(board[r][c] == '*'){
          current[r][c] = -1;
        }
      }
    }
    current[startr][startc] = 1;
    while(time > 0){
      for(int r = 0; r < rows; r++){
        for(int c = 0; c < cols; c++){
          previous[r][c] = current[r][c];
        }
      }
      for(int r = 0; r < rows; r++){
        for(int c = 0; c < cols; c++){
          if(board[r][c] != '*'){
            current[r][c] = 0;
            for(int i = 0; i < moves.length; i++){
              int checkr = r + moves[i][0];
              int checkc = c + moves[i][1];
              if(checkr < rows && checkc < cols && checkr >= 0 && checkc >= 0 && previous[checkr][checkc]!= -1){
                current[r][c] += previous[checkr][checkc];
              }
            }
          }
        }
      }
      time --;
    }
    return current[endr][endc];
  }
}
