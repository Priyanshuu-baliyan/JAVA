package Loops;

import java.util.Scanner;

public class NestedWhile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = "";
    int round = 1;

    while (round <= 2) {
      System.out.print("Round " + round + " (Type 'exit' to stop this round): " );
      str = sc.nextLine();

      while (!str.equals("exit")) {
        System.out.println("you typed: " + str);
        str = sc.nextLine();
      }
      round++;
      System.out.println();
    }
    sc.close();
  
  }
}
