package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);

        list.deleteCity(edmonton);
        assertFalse(list.hasCity(edmonton));
    }

    @Test
    public void testCountCities(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);
        City winnipeg = new City("Winnipeg", "MB");
        list.addCity(winnipeg);
        City vancouver = new City("Vancouver", "BC");
        list.addCity(vancouver);

        assertEquals(4, list.countCities());
    }

}
