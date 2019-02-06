package ru.stqa.sandbox;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

class Point {

  double point1x;
  double point2x;
  double point1y;
  double point2y;

  Point(double point1x, double point1y, double point2x, double point2y) {

    this.point1x = point1x;
    this.point2x = point2x;
    this.point1y = point1y;
    this.point2y = point2y;
  }

  static double distance(Point p) {

    return sqrt(pow(p.point2x - p.point1x, 2) +
            pow(p.point2y - p.point1y,2));


  }
}
