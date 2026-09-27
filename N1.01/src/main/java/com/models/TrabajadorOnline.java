package com.models;

public class TrabajadorOnline extends Trabajador {

    private static final int ONLINEPLUS = 200;

    public TrabajadorOnline(String name, String surname, int priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public int calculateSalary(int hours) {
        return (hours*priceHour) + ONLINEPLUS;
    }

    @Deprecated
    public int calculateOldSalary (int hours) {
        return (hours*priceHour) - 230;
    }
}
