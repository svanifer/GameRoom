package edu.epam.training.oophomework.Specification;

import edu.epam.training.oophomework.entity.Toy;

public class ToySpecificationById {

    private int wantedId;

    public ToySpecificationById(int wantedId){
        super();
        this.wantedId = wantedId;
    }

    public boolean specified(Toy toy) {

        int toyId = toy.getId();
        return wantedId == toyId;
    }
}
