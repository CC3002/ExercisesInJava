package com.cc3002.auxiliar03.example11lookup;

public class C extends B {
  public String method2() {
    return "C.method2() > " + this.method1();
  }
  
  public static void main(String[] args) {
    /* basic method look-up */
    System.out.println(new C().method1());
    System.out.println(new B().method1());
    System.out.println(new A().method1());

    /* this */
    System.out.println(new C().method2());
    System.out.println(new B().method2());
    System.out.println(new A().method2());

    /* super */
    System.out.println(new B().method3());
    System.out.println(new C().method4());
    System.out.println(new C().method5());
}

}
