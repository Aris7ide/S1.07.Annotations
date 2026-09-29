package com.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabajadorOnlineTest {

    TrabajadorOnline trabajadorOnline;

    @BeforeEach
    void toTest() {
        trabajadorOnline = new TrabajadorOnline("Mario", "Rossi", 45);
    }

    @Test
    void shouldCalculateSalary() {
        assertEquals(740, trabajadorOnline.calculateSalary(12));
    }

    @Test
    void shouldCalculateOldSalary() {
        assertEquals(310,trabajadorOnline.calculateOldSalary(12));
    }

}