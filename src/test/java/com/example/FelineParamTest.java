package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParamTest {

    private final int kittensCount;
    private final int expected;

    public FelineParamTest(int kittensCount, int expected) {
        this.kittensCount = kittensCount;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] getCount() {
        return new Object[][] {
                { 1, 1},
                { 10, 10},
        };
    }

    @Test
    public void  testParametrizedGetKittensOfCount() {

        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        assertEquals(expected, actual);
    }
}
