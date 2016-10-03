package com.cc3002.auxiliar03.example15accessibility;

public class Animal {
  private String name;
  public Animal(String name) {
    this.name = name;
  }
  private String getName() {
    return name;
  }
  public String getPair(final Animal paired) {
    return this.getName() + " with " + paired.getName();
  }
  public static void main(String[] args) {
    System.out.println(new Animal("Jirafa").getPair(new Animal("Antilope")));
    System.out.println(new Animal("Tigre").getName());
  }
}
