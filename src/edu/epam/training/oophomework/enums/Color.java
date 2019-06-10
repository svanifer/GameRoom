package edu.epam.training.oophomework.enums;

public enum Color {
    RED, GREEN, YELLOW, BLUE;

    public static Color getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
