package Basics;

class Example {
    byte b;
    int i;
    boolean flag;
    char c;
}

public class DataType { 
    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println("byte: " + obj.b);
        System.out.println("int: " + obj.i);
        System.out.println("boolean: " + obj.flag);
        System.out.println("char: [" + obj.c + "]");
    }
}
