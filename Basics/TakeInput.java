package Basics;

import java.util.Scanner;

public class TakeInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Byte: ");
    Byte b = sc.nextByte();
    System.out.println("Byte Value is: " + b);

    System.out.print("Enter a short: ");
    short sh = sc.nextShort();
    System.out.println("short Value is: " + sh);

    System.out.print("Enter a num: ");
    int num = sc.nextInt();
    System.out.println("Int Value is: " + num);

    System.out.print("Enter a Float: ");
    Float f = sc.nextFloat();
    System.out.println("float Value is: " + f);

    System.out.print("Enter a boolean: ");
    boolean flag = sc.nextBoolean();
    System.out.println("Boolean Value is: " + flag);

    System.out.print("Enter a Char: ");
    char ch = sc.next().charAt(0);
    System.out.println("Char Value is: " + ch);

    System.out.print("Enter a String word: ");
    String str1 = sc.next();
    System.out.println("String Value is: " + str1);

    sc.nextLine(); //consume leftover


    System.out.print("Enter a String Sentence: ");
    String str2 = sc.nextLine();
    System.out.println("String 2 Value is: " + str2);

    System.out.print("Enter a Long: ");
    Long l = sc.nextLong();
    System.out.println("Long Value is: " + l);

    System.out.print("Enter a Double: ");
    double d = sc.nextDouble();
    System.out.println("Double Value is: " + d);

    sc.close();
  }
}
