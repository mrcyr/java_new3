package ru.stqa.sandbox;

class Rectangle {

  double a;
  double b;


  Rectangle(double a, double b) {

    this.a = a;
    this.b = b;
  }

  static double area(Rectangle r) {

    return r.a*r.b;
  }

}
