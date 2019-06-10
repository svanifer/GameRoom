package edu.epam.training.oophomework.validator;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class DataValidorTest {

    DataValidor validor = new DataValidor();

    @Test
    public void intValidationToInt(){
        String s = "11";
        assertEquals(validor.intValidation(s), true);
    }

    @Test
    public void intValidationToNotInt(){
        String s = "011";
        assertEquals(validor.intValidation(s), false);
    }

    @Test
    public void nameValidationIsContain(){
        String s = "Doll";
        assertEquals(validor.nameValidation(s), true);
    }

    @Test
    public void nameValidationIsNotContain(){
        String s = "011";
        assertEquals(validor.nameValidation(s), false);
    }

    @Test
    public void sizeValidationIsContain(){
        String s = "big";
        assertEquals(validor.sizeValidation(s), true);
    }

    @Test
    public void sizeValidationIsNotContain(){
        String s = "bigger";
        assertEquals(validor.sizeValidation(s), false);
    }
}