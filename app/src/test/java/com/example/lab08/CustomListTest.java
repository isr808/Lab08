package com.example.lab08;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

@Test
public void testHasCity() {
    CustomList list = new CustomList();
    City calgary = new City("Calgary", "AB");
    list.addCity(calgary);
    assertTrue(list.hasCity(calgary));

    City vancouver = new City("Vancouver", "BC");
    assertFalse(list.hasCity(vancouver)); // city not added
}