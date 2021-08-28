package ru.geekbrains.ht_1.second_task.cars;

import ru.geekbrains.ht_1.second_task.abstract_classes.Car;
import ru.geekbrains.ht_1.second_task.details.Engine;
import ru.geekbrains.ht_1.second_task.interfaces.Moveable;
import ru.geekbrains.ht_1.second_task.interfaces.Stopable;

public class LightWeightCar extends Car implements Moveable, Stopable {
    public LightWeightCar(Engine engine, String color, String name) {
        super(engine, color, name);
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void open() {
        super.open();
    }

    @Override
    public Engine getEngine() {
        return super.getEngine();
    }

    @Override
    public void setEngine(Engine engine) {
        super.setEngine(engine);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void move() {
        System.out.println(this.getName() + " is moving" );
    }

    /**
     * Каждая машина должна останавливаться
     **/
    public void stop() {
        System.out.println(this.getName() + " is stop" );
    }
}
