package com.cc3002.java.example02.visibility;

public class D extends C {
  public String method1() {
    return "D.method1()";
  }
  
  static public void main(String[] args){
	  System.out.println(new D().method2());
	  
  }
}
