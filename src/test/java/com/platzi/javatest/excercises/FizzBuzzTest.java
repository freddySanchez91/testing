package com.platzi.javatest.excercises;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void cuando_numero_es_divisible_entre_3() {

        FizzBuzz fizzBuzzObjetc =  new FizzBuzz();
        assertEquals("Fizz" , fizzBuzzObjetc.getThemAll(3) );
    }

    @Test
    public void cuando_numero_es_divisible_entre_5() {
        FizzBuzz fizzBuzzObject =  new FizzBuzz();

    }
}