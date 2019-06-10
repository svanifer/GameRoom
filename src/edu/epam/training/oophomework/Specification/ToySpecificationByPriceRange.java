package edu.epam.training.oophomework.Specification;

import edu.epam.training.oophomework.entity.Toy;

public class ToySpecificationByPriceRange {

    private int minPrice;
    private int maxPrice;


    public ToySpecificationByPriceRange(int minPrice, int maxPrice) {
        super();
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public boolean specified(Toy toy) {

        Integer toyPrice = toy.getPrice();
        return toyPrice >= minPrice && toyPrice <= maxPrice;
    }
}
