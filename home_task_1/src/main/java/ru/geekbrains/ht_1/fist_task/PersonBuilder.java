package ru.geekbrains.ht_1.fist_task;

public interface PersonBuilder {
   PersonBuilder  setFirstName(String firstName);
   PersonBuilder  setLastName(String lastName);
   PersonBuilder  setMiddleName(String middleName);
   PersonBuilder  setCountry(String country);
   PersonBuilder  setAddress(String address);
   PersonBuilder  setPhone(String phone);
   PersonBuilder setAge(int age);
   PersonBuilder  setGender(String gender);
   Person build();
}
