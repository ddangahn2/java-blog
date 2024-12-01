package org.example.Constructor;

public class ConstructorExample3 {
    int b = 10;

    ConstructorExample3() {
        b = 3;
    }

    static {
        System.out.println("Class Initial Block");
    }

    {
        System.out.println("Instance Initial Block");
        b++;
    }

    public static void main(String[] args) {
        ConstructorExample3 instance = new ConstructorExample3();
        System.out.println("b = " + instance.b); // b = 3

        ConstructorExample3 instance2 = new ConstructorExample3();
        System.out.println("b = " + instance.b); // b = 3
    }
}
