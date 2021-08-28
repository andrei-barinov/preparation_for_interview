package ru.geekbrains.ht_1.fist_task;

public class PersonBuilderImpl implements PersonBuilder {

    Person person = new Person();

    public PersonBuilder setFirstName(String firstName) {
        person.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        person.lastName = lastName;
        return this;
    }

    public PersonBuilder setMiddleName(String middleName) {
        person.middleName = middleName;
        return this;
    }

    public PersonBuilder setCountry(String country) {
        person.country = country;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        person.address = address;
        return this;
    }

    public PersonBuilder setPhone(String phone) {
        person.phone = phone;
        return this;
    }

    public PersonBuilder setAge(int age) {
        person.age = age;
        return this;
    }

    public PersonBuilder setGender(String gender) {
        person.gender = gender;
        return this;
    }

    public Person build() {
        return person;
    }
}
