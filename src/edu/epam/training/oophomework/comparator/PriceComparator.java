package edu.epam.training.oophomework.comparator;

import edu.epam.training.oophomework.entity.Toy;

import java.util.Comparator;

//This class compares a toys by price.

public class PriceComparator implements Comparator<Toy> {

    public int compare(Toy t1, Toy t2) {
        return t1.getPrice() - t2.getPrice();
    }
}
