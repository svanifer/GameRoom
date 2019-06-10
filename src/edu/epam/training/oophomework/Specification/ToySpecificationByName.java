package edu.epam.training.oophomework.Specification;

import edu.epam.training.oophomework.entity.Toy;

import java.util.Optional;

public class ToySpecificationByName {

    private Optional<String> desiredName;

    public ToySpecificationByName(String desiredName) {
        super();
        this.desiredName = Optional.of(desiredName);
    }

    public boolean specified(Toy toy) {

        String toyName = toy.getName().get();
        return toyName.equals(desiredName.get());
    }
}
