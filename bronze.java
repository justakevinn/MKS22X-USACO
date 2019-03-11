import java.util.*;
import java.io.*;


public class bronze{
  File text;
  Scanner inf;
  int row;
  int col;
  int elevation;
  int numDigs;
  int[][] lake;
  int answer;

  public bronze(String filename){
    try{
      text = new File(filename);
      inf = new Scanner(text);
      row = Integer.parseInt(inf.next());
      col = Integer.parseInt(inf.next());
      elevation = Integer.parseInt(inf.next());
      numDigs = Integer.parseInt(inf.next());
      lake = new int[row][col];
      for (int i = 0; i < row; i++){
        for(int j = 0; j < col; j++){
          lake[i][j] = Integer.parseInt(inf.next());
        }
      }
      System.out.println(toString());
      while (numDigs > 0){
        int Rs = Integer.parseInt(inf.next())-1;
        int Cs = Integer.parseInt(inf.next())-1;
        int D = Integer.parseInt(inf.next());
      /*  System.out.println(Rs);
        System.out.println(Cs);
        System.out.println(D);
        stomp(Rs, Cs, D); */
        numDigs --;
      //  System.out.println(toString());
      }
    }catch(FileNotFoundException e){
      System.out.println("File Not Found");
    }

  }


  private boolean stomp(int Rs, int Cs, int D){
    if (Rs < 0 || Cs < 0 || Rs > row - 2 || Cs > col -2 || D < 1 || D > 40){
      return false;
    }
    while (D > 0){
      int highest = 0;
      for (int i = 0; i < 3; i++){
        for (int j = 0; j < 3; j++){
          if (lake[Rs + i][Cs + j] > highest){
            highest = lake[Rs + i][Cs + j];
          }
        }
      }
      System.out.println("highest : " + highest);
      for (int i = 0; i < 3; i++){
        for (int j = 0; j < 3; j++){
          if (lake[Rs + i][Cs + j] == highest){
            lake[Rs + i][Cs + j] --;
          }
        }
      }
      D--;
    }
    return true;
  }

  public int getElevation(){
    return elevation;
  }

  public int[][] getLake(){
    return lake;
  }


  public String toString(){
    String s = "";
    for (int i = 0; i < lake.length; i++){
      s += "\n";
      for (int j = 0; j < lake[0].length; j++){
        s+= lake[i][j];
        s+= " ";
        //System.out.println(s);
      }
    }
    return s;
  }

}
