import java.util.*;
import java.io.*;


public class USACO{

  public static int bronze(String filename){
    bronze test = new bronze(filename);
    return test.makeLake();
  }


  public static int silver(String filename){
    silver test = new silver(filename);
    return test.cTravel();
  }



  public static void main(String[] args){
    System.out.println(bronze("makelake.1.in"));
    System.out.println(silver("ctravel.1.in"));
  }






}
