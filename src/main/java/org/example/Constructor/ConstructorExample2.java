package org.example.Constructor;

public class ConstructorExample2 {
    static int a = 1;

    static {
        System.out.println("Class Initial Block");
        a = 2;
    }

    {
        System.out.println("Instance Initial Block");
        a = 3;
    }

    public static void main(String[] args) {
        System.out.println("a = " + ConstructorExample2.a); // a = 2

        ConstructorExample2 instance = new ConstructorExample2();
        System.out.println("a = " + ConstructorExample2.a); // a = 3
    }
}

// Class Initial Block
// a = 2
// Instance Initial Block
// a = 3