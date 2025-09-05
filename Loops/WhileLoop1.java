package Loops;

import java.util.Scanner;

public class WhileLoop1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int i = 1;
    while (i <= num) {
      System.out.println("i = " + i);
      i++;
    }
    sc.close();
  }
}
