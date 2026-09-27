package com.models;

public class TrabajadorPresencial extends Trabajador{

    private static int gasoline;

    public TrabajadorPresencial(String name, String surname, int priceHour, int gasoline) {
        super(name, surname, priceHour);
        this.gasoline = gasoline;
    }

    @Override
    public int calculateSalary(int hours) {
        return (hours*priceHour) + gasoline;
    }
}
