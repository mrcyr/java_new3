package ru.stqa.sandbox;

public class Sout {

    public static void main(String[] args) {

        hello("Hello");

        Square s = new Square(5);
        System.out.println("Площадь квадрата " + "со стороной " + s.l + " равна " + Square.area(s));


        Rectangle r = new Rectangle(5, 10);
        System.out.println("Площадь прямоугольника " + "со сторонами " + r.a + " и " + r.b + " равна " + Rectangle.area(r));

        Point p = new Point(1, 2, 4,5);
        System.out.println("Расстрояние между точкой 1 c координатами " + p.point1x + " и " + p.point1y + " и точкой 2 с координатами " + p.point2x + " и " + p.point2y + " равно "+ Point.distance(p));

    }

    private static void hello(String a) {
        System.out.println(a);
    }

}