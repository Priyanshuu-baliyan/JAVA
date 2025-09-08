package Functions;

public class FunctionWithParameters {

  public static int add(int a, int b){
    return a + b;
  }
  public static float average(float x, float y){
    return (x + y)/2;

  }

  public static boolean isEven(int num){
    return num % 2 == 0;
  }
  public static void greet(String name){
    System.out.println("Hello, " + name);
  }

  public static void main(String[] args) {

    System.out.println(add(10,20));
    System.out.println(average(100, 100));

    
    System.out.println("is this number is even: " + isEven(10));
    System.out.println("is this number is even: " + isEven(15));

    greet("Ayush Jaat");
  }
}
