package edu.epam.training.oophomework.entity;

import edu.epam.training.oophomework.enums.DollType;

import java.util.Objects;
import java.util.Optional;

public class Doll extends Toy{

    private Optional<String> brand;
    private Optional<DollType> dollType;


    public Doll(String name, DollType type) {
        super(name);
        this.dollType = Optional.of(type);
    }

    public Doll(int id, String name, String size, int price, DollType type, String brand) {
        super(id, name, size, price);
        this.dollType = Optional.of(type);
        this.brand = Optional.of(brand);
    }

    public Optional<String> getBrand() {
        return brand;
    }

    public void setBrand(Optional<String> brand) {
        this.brand = brand;
    }

    public Optional<DollType> getDollType() {
        return dollType;
    }

    public void setDollType(DollType dollType) {
        this.dollType = Optional.of(dollType);
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "dollType = " + dollType.get() +
                ", brand = " + brand.get() +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doll doll = (Doll) o;
        return Objects.equals(brand, doll.brand) &&
                Objects.equals(dollType, doll.dollType);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), brand, dollType);
    }
}
