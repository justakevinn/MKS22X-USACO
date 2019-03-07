import java.util.*;
import java.io.*;


public class USACO{

  public static int bronze(String filename) throws FileNotFoundException{
    File text = new File(filename);
    Scanner inf = new Scanner(text);
    int row = Integer.parseInt(inf.next());
    int col = Integer.parseInt(inf.next());
    int elevation = Integer.parseInt(inf.next());
    int numDigs = Integer.parseInt(inf.next());
    int[][] lake = new int[row][col];
    for (int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        lake[i][j] = Integer.parseInt(inf.next());
      }
    }
    System.out.println(row + " " + col + " " + elevation + " " + numDigs);
    System.out.println(toStringArray(lake));
    return makeLake(row, col, elevation, numDigs);
    //return 0;

  }

  public static int makeLake(int R, int C, int E, int N){
    return 0;

  }

  public static String toStringArray(int[][] ary){
    String s = "";
    for (int i = 0; i < ary.length; i++){
      s += "\n";
      for (int j = 0; j < ary[0].length; j++){
        s+= ary[i][j];
        s+= " ";
        //System.out.println(s);
      }
    }
    return s;
  }

  public static void main(String[] args){
    try{
      System.out.println(bronze("makelake.1.in"));
    }catch(FileNotFoundException e){
      System.out.println("File Not Found");
    }
  }






}
