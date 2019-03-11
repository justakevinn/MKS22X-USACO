import java.util.*;
import java.io.*;


public class silver{
  File text;
  Scanner inf;
  int[][] map;
  int[][][] tmap; //map with time;
  int ans;
  int[] x = new int[] {1,-1,0,0};
  int[] y = new int[] {0,0,1,-1};
  int r1,r2,c1,c2;
  int n,m,t;

  public silver(String filename){
    try{
      text = new File(filename);
      inf = new Scanner(text);
      n = Integer.parseInt(inf.next());
      m = Integer.parseInt(inf.next());
      t = Integer.parseInt(inf.next());
  /*    System.out.println("n: " + n);
      System.out.println("m: " + m);
      System.out.println("t: " + t);*/
      inf.nextLine();
      map = new int[n][m];
      tmap = new int[n][m][t+1];
      for (int i = 0; i < n; i++) {
        String line = inf.nextLine();
        //System.out.println(line);
        for (int j = 0; j < m; j++) {
            map[i][j] = line.charAt(j);
            tmap[i][j][0] = 0;
          }
        }
    	r1 = Integer.parseInt(inf.next())-1;
      c1 = Integer.parseInt(inf.next())-1;
      r2 = Integer.parseInt(inf.next())-1;
      c2 = Integer.parseInt(inf.next())-1;

  /*    System.out.println("r1: " + r1);
      System.out.println("c1: " + c1);
      System.out.println("r2: " + r2);
      System.out.println("c2: " + c2);*/

    }catch(FileNotFoundException e){
      System.out.println("File Not Found");
    }
  }



  public int cTravel(){
    tmap[r1][c1][0] = 1;
    for (int i = 0; i < t; i ++) {
				for (int j = 0; j < m; j ++) {
					for (int k = 0; k < n; k ++) {
						for (int l = 0; l < 4; l ++) {
							int xMove = j + x[l];
							int yMove = k + y[l];
							if (xMove >= 0 && xMove < m && yMove >= 0 && yMove < n) {
								if (map[xMove][yMove] != '*') {
									tmap[j][k][i+1] += tmap[xMove][yMove][i];
								}
							}
						}
					}
				}
			}
			ans = tmap[r2][c2][t];
//    System.out.println(ans);
    return ans;

  }


}
