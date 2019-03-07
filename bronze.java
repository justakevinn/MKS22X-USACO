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



  File text = new File(filename);
  Scanner inf = new Scanner(text);
  int row = Integer.parseInt(inf.next());
  int col = Integer.parseInt(inf.next());
  int elevation = Integer.parseInt(inf.next());
  int numDigs = Integer.parseInt(inf.next());
  int[][] lake = new int[row][col];
}
