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
      for (int i = 0; i < m; i ++) {
				String str = scan.nextLine();
				for (int j = 0; j< n; j ++) {
					ground[i][j] = str.charAt(j);
					maze[i][j][0] = 0;
				}
			}
			line = scan.nextLine().split("\\s+");
			r1 = Integer.parseInt(line[0])-1;
			c1 = Integer.parseInt(line[1])-1;
			r2 = Integer.parseInt(line[2])-1;
			c2 = Integer.parseInt(line[3])-1;
      for (int a = 0; a <t; a ++) {
				for (int b = 0; b < m; b ++) {
					for (int c = 0; c < n; c ++) {
						for (int d = 0; d < 4; d ++) {
							int xMove = b + x[d];
							int yMove = c + y[d];
							if (xMove >= 0 && xMove < m && yMove >= 0 && yMove < n) {
								if (ground[xMove][yMove] != '*') {
									maze[b][c][a+1] += maze[xMove][yMove][a];
								}
							}
						}
					}
				}
			}
			ans = maze[r2][c2][t];
			maze[r1][c1][0] = 1;


  }catch(FileNotFoundException e){
	    System.out.println("File Not Found");
	}
}
}
