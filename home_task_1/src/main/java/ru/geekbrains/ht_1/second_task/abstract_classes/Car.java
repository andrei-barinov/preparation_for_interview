package ru.geekbrains.ht_1.second_task.abstract_classes;

import ru.geekbrains.ht_1.second_task.details.Engine;

public abstract class Car {
    private Engine engine;
    /**
     * Поменял модификатор доступа на private, чтобы не было доступа к полю из вне.
     * Добавил класс, который создает объект типа Engine, потому что в исходном коде его не было
     **/
    private String color;
    private String name;

    /**
     * Добавил конструктор абстрактного класса, так как все машины будут имет данные параметры и проще создать
     * конструктор в абстрактном классе, чем каждый раз писать конструктор в каждом конкретном классе машин
     **/
    public Car(Engine engine, String color, String name) {
        this.engine = engine;
        this.color = color;
        this.name = name;
    }

    /**
     * Непонятно почему protected, поменял на public
     **/
    public void start() {
        System.out.println(this.name + " starting");
    }

    /**
     * Каждая машина должна открываться, поэтому считаю, что данный метод должен наследоваться реализованным
     **/
    public void open() {
        System.out.println(this.name + " opening");
    };


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
