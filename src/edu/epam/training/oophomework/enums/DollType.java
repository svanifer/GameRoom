package edu.epam.training.oophomework.enums;

public enum DollType {
    GIRL, BOY, BABY;

    public static DollType getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
