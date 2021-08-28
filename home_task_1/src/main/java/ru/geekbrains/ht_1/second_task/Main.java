package ru.geekbrains.ht_1.second_task;

import ru.geekbrains.ht_1.second_task.cars.LightWeightCar;
import ru.geekbrains.ht_1.second_task.cars.Lorry;
import ru.geekbrains.ht_1.second_task.details.Engine;

public class Main {
    public static void main(String[] args) {
        LightWeightCar bmw = new LightWeightCar(new Engine(2.0f,150), "Black", "BMW-7");
        bmw.open();
        bmw.start();
        bmw.move();
        bmw.stop();

        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("");

        Lorry kamaz = new Lorry(new Engine(10.85f, 220), "Green", "KAMAZ", 15000);
        kamaz.open();
        kamaz.start();
        kamaz.move();
        kamaz.stop();
    }
}
