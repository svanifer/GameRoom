package edu.epam.training.oophomework.comparator;

import edu.epam.training.oophomework.entity.Toy;

import java.util.Comparator;

//This class compares a toys by id.

public class IdComparator implements Comparator<Toy> {

    public int compare(Toy t1, Toy t2) {
        return t1.getId() - t2.getId();
    }
}
