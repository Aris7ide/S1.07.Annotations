package com.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabajadorPresencialTest {

    @Test
    void shouldCalculateSalary() {
        TrabajadorPresencial trabajador= new TrabajadorPresencial("Mario", "Rossi", 45,200);
        assertEquals(740,trabajador.calculateSalary(12));
    }

}