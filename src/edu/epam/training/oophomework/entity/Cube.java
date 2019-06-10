package edu.epam.training.oophomework.entity;

import edu.epam.training.oophomework.enums.Color;

import java.util.Objects;
import java.util.Optional;

public class Cube extends Toy{

    private Optional<String> material;
    private Optional<Color> color;

    public Cube(String name, Color color) {
        super(name);
        this.color = Optional.of(color);
    }

    public Cube(int id, String name, String size, int price, Color color, String material) {
        super(id, name, size, price);
        this.color = Optional.of(color);
        this.material = Optional.of(material);
    }

    public Optional<String> getMaterial() {
        return material;
    }

    public void setMaterial(Optional<String> material) {
        this.material = material;
    }

    public Optional<Color> getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = Optional.of(color);
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "color = " + color.get() +
                ", material = " + material.get() +
                "}";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cube cube = (Cube) o;
        return Objects.equals(material, cube.material) &&
                Objects.equals(color, cube.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), material, color);
    }
}
