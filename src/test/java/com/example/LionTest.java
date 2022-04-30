package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void testGetKittensReturnsCountLion()  {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(50);
        Assert.assertEquals(50, lion.getKittens());
    }

    @Test
    public void testGetFamilyReturnsFelineOfLion(){
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testEatMeatFelineOfLion() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }


    @Test (expected = Exception.class)
    public void testDoesNotHaveManeErrorSex() throws Exception {
        Lion lion = new Lion("Недосамец");

    }
}


