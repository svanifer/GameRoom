package edu.epam.training.oophomework.util;

import edu.epam.training.oophomework.entity.*;
import edu.epam.training.oophomework.enums.CarType;
import edu.epam.training.oophomework.enums.Color;
import edu.epam.training.oophomework.enums.DollType;
import java.util.NoSuchElementException;
import java.util.Random;

public class ToyFactory {

    public static Toy createToyFromFactory(int id, String name, String size, int price) {

        Random random = new Random();
        String[] brands = new String[]{"barby", "lol", "baby born"};
        String[] signs = new String[]{"adidas", "select", "nike"};
        String[] materials = new String[]{"plastic", "fabric", "leather"};
        String sign = String.valueOf(name.toUpperCase());

        switch(sign) {
            case "BALL": return new Ball(id, name, size, price, Color.getRandom(), signs[random.nextInt(signs.length)]);
            case "CUBE": return new Cube(id, name, size, price, Color.getRandom(), materials[random.nextInt(materials.length)]);
            case "CAR": return new Car(id, name, size, price, CarType.getRandom(), random.nextBoolean());
            case "DOLL": return new Doll(id, name, size, price, DollType.getRandom(), brands[random.nextInt(brands.length)]);
            default: throw new NoSuchElementException();
        }
    }
}
