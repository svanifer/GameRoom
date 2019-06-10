package edu.epam.training.oophomework.entity;

import java.util.Objects;
import java.util.Optional;

//This class is basic class for all toys
abstract public class Toy {

    private int id;
    private Optional<String> name;
    private Optional<String> size;
    private int price;

    public Toy(String name) {
        this.name = Optional.of(name);
    }

    public Toy(Integer id, String name, String size, Integer price) {
        if (price < 0) {
            throw new IllegalArgumentException("Cannot create toy with price = "
                    + price);
        }

        this.id = id;
        this.name = Optional.of(name);
        this.size = Optional.of(size);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id = " + id +
                ", name = " + name.get() +
                ", size = " + size.get() +
                ", price = " + price +
                '}';
    }

    public void setName(String name) {
        this.name = Optional.of(name);
    }

    public void setColor(String size) {
        this.size = Optional.of(size);
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public Optional<String> getName() {
        return name;
    }

    public Optional<String> getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return id == toy.id &&
                price == toy.price &&
                Objects.equals(name, toy.name) &&
                Objects.equals(size, toy.size);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, size, price);
    }
}
