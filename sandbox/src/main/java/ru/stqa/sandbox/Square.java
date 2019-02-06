package ru.stqa.sandbox;

public class Square {

  double l;

  Square(double l) {

    this.l = l;
  }
  public static void hello(String a) {
    System.out.println(a);
  }

  static double area(Square s) {

    return s.l*s.l;
  }
}


