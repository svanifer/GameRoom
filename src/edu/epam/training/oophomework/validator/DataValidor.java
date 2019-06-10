package edu.epam.training.oophomework.validator;

import java.util.*;

//This class to validation input data.

public class DataValidor {

    ////This method to validation integers
    public boolean intValidation(String string){

        final String CHEKER = "^([+]?[1-9]\\d*|0)$";

        return string.matches(CHEKER);
    }

    //This method to validation names of toys
    public boolean nameValidation(String name){

        List<String> namesOfToys = new ArrayList<>(Arrays.asList(
                "Ball", "Car", "Cube", "Doll"));

        return namesOfToys.contains(name);
    }
    //This method to validation size of toys
    public boolean sizeValidation(String name){

        List<String> sizeOfToys = new ArrayList<>(Arrays.asList(
                "small", "middle", "big"));

        return sizeOfToys.contains(name);
    }
}
