package com.cc3002.auxiliar03.example13lookupprotected;

public class B extends A {
  public String method1() {
    return "B.method1()";
  }

  public static void main(String[] args) {
    System.out.println(new A().method2());
    System.out.println(new B().method2());
  }

}
