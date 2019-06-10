package edu.epam.training.oophomework.util;

import edu.epam.training.oophomework.entity.Car;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

import static org.testng.Assert.assertEquals;

public class ToyFactoryTest {

    @Test
    public void createToyFromFactoryCorrectName(){

        int id = 1;
        String name = "Car";
        String size = "small";
        int price = 7;
        assertEquals(ToyFactory.createToyFromFactory(id, name, size, price).getClass(), Car.class);
    }

    @Test(expectedExceptions = NoSuchElementException.class)
    public void createToyFromFactoryIncorrectName(){

        int id = 1;
        String name = "bus";
        String size = "small";
        int price = 7;
        ToyFactory.createToyFromFactory(id, name, size, price);
    }
}