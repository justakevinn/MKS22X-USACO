import java.util.*;
import java.io.*;


public class USACO{

  public static int bronze(String filename){
    bronze test = new bronze(filename);
    int answer = 0;
    int[][] lake = test.getLake();
    int elevation = test.getElevation();
    for (int i = 0; i < lake.length; i++){
				for (int j = 0; j < lake[i].length; j++){
					if (lake[i][j] < elevation){
						answer += elevation - lake[i][j];
					}
        }
      }
      answer = answer * 5184;
      return answer;
  }




  public static void main(String[] args){
    System.out.println(bronze("makelake.1.in"));
  }






}
