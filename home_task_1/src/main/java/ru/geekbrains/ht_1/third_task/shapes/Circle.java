package ru.geekbrains.ht_1.third_task.shapes;

import ru.geekbrains.ht_1.third_task.abstract_classes.Shape;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Площадь круга: " + String.format("%.2f", Math.PI * Math.pow(this.radius, 2)));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Длина окружности: " + String.format("%.2f", 2 * Math.PI * this.radius));
    }

}
