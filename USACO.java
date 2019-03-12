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



  public static void main(String[] args)throws FileNotFoundException{
    System.out.println(bronze("makelake.1.in"));
    System.out.println(silver("ctravel.1.in"));
    File correct = new File("testCases/ctravel." + 1 + ".out");
    Scanner yes = new Scanner(correct);
    int correctAnswer = yes.nextInt();
    System.out.println(correctAnswer);
    System.out.println(silver("ctravel.2.in"));
    correct = new File("testCases/ctravel." + 2 + ".out");
    yes = new Scanner(correct);
    correctAnswer = yes.nextInt();
    System.out.println(correctAnswer);
    System.out.println(silver("ctravel.3.in"));
    correct = new File("testCases/ctravel." + 3 + ".out");
    yes = new Scanner(correct);
    correctAnswer = yes.nextInt();
    System.out.println(correctAnswer);
    System.out.println(silver("ctravel.4.in"));
    correct = new File("testCases/ctravel." + 4 + ".out");
    yes = new Scanner(correct);
    correctAnswer = yes.nextInt();
    System.out.println(correctAnswer);
    System.out.println(silver("ctravel.5.in"));
    correct = new File("testCases/ctravel." + 5 + ".out");
    yes = new Scanner(correct);
    correctAnswer = yes.nextInt();
    System.out.println(correctAnswer);
  }






}
