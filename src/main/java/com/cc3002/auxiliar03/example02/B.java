package com.cc3002.auxiliar03.example02;

public class B extends A {
  String m(A o1, A o2) {
    return "B.m(A,A)";
  }

  public static void main(String[] argv) {
    System.out.println(new B().m(new A(), new B()));
  }
}
