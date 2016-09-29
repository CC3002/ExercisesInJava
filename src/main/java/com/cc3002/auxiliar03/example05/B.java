package com.cc3002.auxiliar03.example05;

public class B extends A {
  String m(A o1, A o2) {
    return "B.m(A,A)";
  }

  public static void main(String[] argv) {
    A object1 = new B();
    A object2 = new B();
    System.out.println(new B().m(object1, (B) object2));
  }
}
