package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public class CustomListTest {
        @Test
        public void testHasCity() {
            CustomList list = new CustomList();
            City calgary = new City("Calgary", "AB");
            list.addCity(calgary);
            // This will fail initially because hasCity() doesn't
            exist
            assertTrue(list.hasCity(calgary));
        }
    }
    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }
}
