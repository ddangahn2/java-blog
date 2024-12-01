package org.example.Constructor;

public class ConstructorExample1 {
    static int a;
    int b;

    public static void main(String args[])
    {
        // 클래스변수 a는 클래스 로딩시에 int의 기본값 0으로 초기화된다.
        System.out.println("a = " + ConstructorExample1.a); // a = 0

        // 인스턴스변수 b는 인스턴스 생성시 int의 기본값 0으로 초기화된다.
        ConstructorExample1 instance = new ConstructorExample1();
        System.out.println("b = " + instance.b); // b = 0
    }
}
