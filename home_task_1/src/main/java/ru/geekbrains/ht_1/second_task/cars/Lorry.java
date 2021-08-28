package ru.geekbrains.ht_1.second_task.cars;

import ru.geekbrains.ht_1.second_task.abstract_classes.Car;
import ru.geekbrains.ht_1.second_task.details.Engine;
import ru.geekbrains.ht_1.second_task.interfaces.Moveable;
import ru.geekbrains.ht_1.second_task.interfaces.Stopable;

public class Lorry extends Car implements Moveable, Stopable {

    /**
     * Абстрактные классы наследуются, а интерфейсы имплементируются, исправил в объявлении класса
     * Для грузовика добавил еще поле "Грузоподъемность", так как это важная характеристика грузовика
     * **/
    private int carryingCapacity;
    public Lorry(Engine engine, String color, String name, int carryingCapacity) {
        super(engine, color, name);
        this.carryingCapacity = carryingCapacity;
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

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public void move() {
        System.out.println(this.getName() + " is moving" );
    }

    public void stop() {
        System.out.println(this.getName() + " is stop" );
    }
}
