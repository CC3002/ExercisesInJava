package com.cc3002.auxiliar03.example13lookupprotected;

public class A {
  protected String method1() {
    return "A.method1()";
  }
  public String method2() {
    return "A.method2() > " + this.method1();
  }
}
