package edu.epam.training.oophomework.comparator;

import edu.epam.training.oophomework.entity.Toy;
import java.util.Comparator;

//This class compares a vegetables by name.

public class NameComparator implements Comparator<Toy> {

    public int compare(Toy t1, Toy t2) {

        return t1.getName().get().compareTo(t2.getName().get());
    }
}
