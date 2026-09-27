package com.models;

public class Trabajador {

    String name;
    String surname;
    int priceHour;

    public Trabajador(String name, String surname, int priceHour) {
        this.name = name;
        this.surname = surname;
        this.priceHour = priceHour;
    }

    public int calculateSalary(int hours) {
        return hours*priceHour;
    }
}
