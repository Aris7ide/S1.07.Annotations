package com.models;

import com.annotations.JsonSerializable;

@JsonSerializable(directory = "N2.01/Jsons")
public class Person {

    String name;
    String surname;
    int age;

    public Person(String name, int age, String surname) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }


}
