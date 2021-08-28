package ru.geekbrains.ht_1.fist_task;

public class Person {
     String firstName;
     String lastName;
     String middleName;
     String country;
     String address;
     String phone;
     int age;
     String gender;

     public void print(){
          System.out.println(
                  "Person:" + '\n' +
                          "firstName='" + firstName + '\'' + '\n' +
                          "lastName='" + lastName + '\'' + '\n' +
                          "middleName='" + middleName + '\'' + '\n' +
                          "country='" + country + '\'' + '\n' +
                          "address='" + address + '\'' + '\n' +
                          "phone='" + phone + '\'' + '\n' +
                          "age=" + age + '\n' +
                          "gender='" + gender + '\'' + '\n'
          );
     }
}
