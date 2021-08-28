package ru.geekbrains.ht_1.third_task.shapes;

import ru.geekbrains.ht_1.third_task.abstract_classes.Shape;

public class Square extends Shape {
    private int a;

    public Square(int a){
        this.a = a;
    }

    @Override
    public void calculateArea() {
        System.out.println("Площадь квадрата: " + this.a * this.a);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Периметр квадрата: " + 4 * this.a);
    }
}
