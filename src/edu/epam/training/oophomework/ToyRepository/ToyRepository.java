package edu.epam.training.oophomework.ToyRepository;

import edu.epam.training.oophomework.Specification.*;
import edu.epam.training.oophomework.entity.Toy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class ToyRepository {

    private Optional<List<Toy>> toyset;

    public ToyRepository(List<Toy> toyset) {
        this.toyset = Optional.ofNullable(toyset);
    }

    public Optional<List<Toy>> getToySet() {
        return toyset;
    }

    public void setToySet(List<Toy> set) {
        this.toyset = Optional.of(set);
    }

    void addToy (Toy toy){

        List<Toy> toyList = toyset.get();
        toyList.add(toy);

    }

    void deleteToy (Toy toy){

        List<Toy> toyList = toyset.get();
        Iterator iterator = toyList.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals(toy)) {
                iterator.remove();
            }
        }

    }

    public Optional<Toy> findToyById(ToySpecificationById specification){

        Toy toy = null;

        for (Toy t: toyset.get()) {
            if (specification.specified(t)){
                toy = t;
            }
        }
        return Optional.ofNullable(toy);
    }

    public List<Toy> findToysByName(ToySpecificationByName specification){

        List<Toy> toys = new ArrayList<>();

        for (Toy t: toyset.get()) {
            if (specification.specified(t)){
                toys.add(t);
            }
        }
        return toys;
    }

    public List<Toy> findToysByPrice(ToySpecificationByPriceRange specification){

        List<Toy> toys = new ArrayList<>();

        for (Toy t: toyset.get()) {
            if (specification.specified(t)){
                toys.add(t);
            }
        }
        return toys;
    }
}
