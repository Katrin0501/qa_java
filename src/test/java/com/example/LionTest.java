package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getFamily() throws Exception {
        Lion lion = new Lion("Самка",feline);
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
   public void eatMeat() throws Exception {
        Lion lion = new Lion("Самец",feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

   @Test

   public  void doesHaveMane {
        Lion lion = new Lion(h)

   }
}
