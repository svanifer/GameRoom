package edu.epam.training.oophomework.enums;

public enum CarType {
    CAR, VAN, BUS, TRUCK;

    public static CarType getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
