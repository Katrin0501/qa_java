package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest {



    @Test
    public void testGetFoodHavePredator() throws Exception {
        Animal animal = new Animal();
        List<String> actual  = animal.getFood("Хищник");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
        }

    @Test
    public void testGetFoodHaveHerbivore() throws Exception {
        Animal animal = new Animal();
        List<String> actual  = animal.getFood("Травоядное");
        assertEquals(List.of("Трава", "Различные растения"), actual);
    }

    @Test
    public void testGetFamilyDifferentAnimals() {
        Animal animal = new Animal();
        String actual = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", actual);
    }

   @Test (expected = Exception.class)
   public void testDoesNotAnimalKind() throws Exception {
       Animal animal = new Animal();
       List<String> actual  = animal.getFood("Человек");

    }
}