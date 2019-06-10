package edu.epam.training.oophomework.Specification;

import edu.epam.training.oophomework.entity.Toy;
import edu.epam.training.oophomework.util.ToyFactory;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ToySpecificationByNameTest {

    ToySpecificationByName specification = new ToySpecificationByName("Car");

    @Test
    public void specifiedTrue(){
        Toy toy = ToyFactory.createToyFromFactory(1, "Car", "big", 7);
        assertEquals(specification.specified(toy), true);
    }

    @Test
    public void specifiedFalse(){
        Toy toy = ToyFactory.createToyFromFactory(1, "Doll", "big", 7);
        assertEquals(specification.specified(toy), false);
    }
}