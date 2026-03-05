package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);

        assertTrue(list.hasCity(city));
    }
    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();

        City toronto = new City("Toronto", "ON");

        list.addCity(toronto);

        list.deleteCity(toronto);

        assertFalse(list.hasCity(toronto));
    }
    @Test
    public void testCountCities() {
        CustomList list = new CustomList();

        City edmonton = new City("Edmonton", "AB");
        City calgary = new City("Calgary", "AB");

        list.addCity(edmonton);
        list.addCity(calgary);

        assertEquals(2, list.countCities());
    }
}