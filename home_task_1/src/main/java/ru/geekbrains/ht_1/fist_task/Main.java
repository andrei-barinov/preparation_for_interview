package ru.geekbrains.ht_1.fist_task;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilderImpl()
                .setFirstName("Andrei")
                .setMiddleName("Alekseevich")
                .setLastName("Barinov")
                .setCountry("Russia")
                .setPhone("+79200131291")
                .setAge(27)
                .setGender("male")
                .build();

        person.print();
    }
}
