package edu.epam.training.oophomework.Specification;

import edu.epam.training.oophomework.entity.Toy;
import edu.epam.training.oophomework.util.ToyFactory;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class ToySpecificationByPriceRangeTest {

    ToySpecificationByPriceRange specification = new ToySpecificationByPriceRange(0, 10);

    @Test
    public void specifiedTrue(){
        Toy toy = ToyFactory.createToyFromFactory(1, "Car", "big", 7);
        assertEquals(specification.specified(toy), true);
    }

    @Test
    public void specifiedFalse(){
        Toy toy = ToyFactory.createToyFromFactory(1, "Car", "big", 11);
        assertEquals(specification.specified(toy), false);
    }
}