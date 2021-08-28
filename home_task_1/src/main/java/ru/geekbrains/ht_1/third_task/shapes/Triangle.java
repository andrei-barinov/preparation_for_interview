package ru.geekbrains.ht_1.third_task.shapes;

import ru.geekbrains.ht_1.third_task.abstract_classes.Shape;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void calculateArea() {
        double p = ((double) this.a + (double) this.b + (double) this.c) / 2;
        double square = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
        System.out.println("Площадь треугольника: " + String.format("%.2f", square));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Периметр треугольника: " + (this.a + this.b + this.c));
    }

}
