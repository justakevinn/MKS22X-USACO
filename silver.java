import java.util.*;
import java.io.*;


public class silver{

  char[][] ground;
  int[][][] maze;
  int ans;
  int[] x = new int[] {1,-1,0,0};
	int[] y = new int[] {0,0,1,-1};
	int r1,r2,c1,c2;
	int m,n,t;

  public silver(String filename){
    int ans = 0;
    try{
			Scanner scan = new Scanner(new File(filename));
			String[] line = scan.nextLine().split("\\s+");
			m = Integer.parseInt(line[0]);
			n = Integer.parseInt(line[1]);
			t = Integer.parseInt(line[2]);
			ground = new char[m+1][n+1];
			maze = new int[m][n][t+1];
  }catch(FileNotFoundException e){
	    System.out.println("File Not Found");
	}
}
}
