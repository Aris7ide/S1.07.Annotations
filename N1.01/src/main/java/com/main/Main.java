package com.main;

import com.models.Trabajador;
import com.models.TrabajadorOnline;
import com.models.TrabajadorPresencial;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Trabajador worker = new Trabajador("Mario", "Rossi", 25);
        TrabajadorOnline onlineWorker = new TrabajadorOnline("Fabio", "Russo", 59);
        TrabajadorPresencial officeWorker = new TrabajadorPresencial("Rossella", "Intini", 12,320);

        System.out.println("El trabajador gana " + worker.calculateSalary(12));
        System.out.println("El trabajador en remoto gana " + onlineWorker.calculateSalary(12));
        System.out.println("El trabajador presencial gana " +officeWorker.calculateSalary(12));

        System.out.println(onlineWorker.calculateOldSalary(12));

    }
}
