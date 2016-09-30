package com.cc3002.auxiliar03.example11lookup;

public class A {
  public String method1() {
    return "A.method1()";
  }
  public String method2() {
    return "A.method2() > " + this.method1();
  }
  public String method5() {
    return "A.method5() > " + this.method2();
  }
}
