package com.cc3002.auxiliar03.example07.constructors;

public class D extends C {
  public D() {
    this("dog");
    System.out.print("new D() > ");
  }
  public D(String name) {
    super(name);
    System.out.print("new D(" + name + ") > ");
  }
  public D(int number) {
    super();
    System.out.print("new D(" + number + ") > ");
  }
}
