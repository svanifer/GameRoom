package edu.epam.training.oophomework.Specification;

import edu.epam.training.oophomework.entity.Toy;
import edu.epam.training.oophomework.util.ToyFactory;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ToySpecificationByIdTest {

    ToySpecificationById specification = new ToySpecificationById(3);

    @Test
    public void pecifiedTrue(){
        Toy toy = ToyFactory.createToyFromFactory(3, "Car", "big", 7);
        assertEquals(specification.specified(toy), true);
    }

    @Test
    public void pecifiedFalse(){
        Toy toy = ToyFactory.createToyFromFactory(1, "Car", "big", 7);
        assertEquals(specification.specified(toy), false);
    }
}