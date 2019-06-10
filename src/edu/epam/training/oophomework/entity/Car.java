package edu.epam.training.oophomework.entity;

import edu.epam.training.oophomework.enums.CarType;

import java.util.Objects;
import java.util.Optional;

public class Car extends Toy{

    private Optional<Boolean> isCollection;
    private Optional<CarType> carType;


    public Car(String name, CarType type) {
        super(name);
        this.carType = Optional.of(type);
    }

    public Car(int id, String name, String size, int price, CarType type, Boolean isCollection) {
        super(id, name, size, price);
        this.carType = Optional.of(type);
        this.isCollection = Optional.of(isCollection);
    }

    public Optional<Boolean> getIsCollection() {
        return isCollection;
    }

    public void setIsCollection(Optional<Boolean> isCollection) {
        this.isCollection = isCollection;
    }

    public Optional<CarType> getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = Optional.of(carType);
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "carType = " + carType.get() +
                ", isCollection = " + isCollection.get() +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Objects.equals(isCollection, car.isCollection) &&
                Objects.equals(carType, car.carType);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), isCollection, carType);
    }
}
