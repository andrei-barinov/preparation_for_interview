package ru.geekbrains.ht_1.third_task;

import ru.geekbrains.ht_1.third_task.abstract_classes.Shape;
import ru.geekbrains.ht_1.third_task.shapes.Circle;
import ru.geekbrains.ht_1.third_task.shapes.Square;
import ru.geekbrains.ht_1.third_task.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        circle.calculateArea();
        circle.calculatePerimeter();

        System.out.println("-----------------------");

        Shape square = new Square(5);
        square.calculateArea();
        square.calculatePerimeter();

        System.out.println("-----------------------");

        Shape triangle = new Triangle(2, 5, 6);
        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
}
