package edu.epam.training.oophomework.entity;

import edu.epam.training.oophomework.enums.Color;

import java.util.Objects;
import java.util.Optional;

public class Ball extends Toy{

    private Optional<String> sign;
    private Optional<Color> color;

    public Ball(String name, Color color) {
        super(name);
        this.color = Optional.of(color);
    }

    public Ball(int id, String name, String size, int price, Color color, String sign) {
        super(id, name, size, price);
        this.color = Optional.of(color);
        this.sign = Optional.of(sign);
    }

    public Optional<String> getSign() {
        return sign;
    }

    public void setSign(Optional<String> sign) {
        this.sign = sign;
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
                ", sign = " + sign.get() +
                "} " ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ball ball = (Ball) o;
        return Objects.equals(sign, ball.sign) &&
                Objects.equals(color, ball.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), sign, color);
    }
}
