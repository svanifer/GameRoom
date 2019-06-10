package edu.epam.training.oophomework.util;

import edu.epam.training.oophomework.comparator.*;
import edu.epam.training.oophomework.entity.*;
import org.apache.log4j.Logger;
import java.util.Optional;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

//This class works on list of toys
public class RoomWorker {

    final static Logger logger = Logger.getLogger(RoomWorker.class);

    List<Toy> toys;

    public RoomWorker(Optional<List<Toy>> toys) {
    this.toys = toys.get();
    }

    public void showToys() {
        //This method demonstrate list of toys

        if (toys.isEmpty()) {
            logger.warn("You haven't added any toys yet!");

            return;
        }

        for (Toy toy : toys) {
            logger.info(toy.toString());
        }

        logger.info("----------------------------");

    }

    public void showToys(List<Toy> toyList) {
        //This method demonstrate list of toys

        if (toyList.isEmpty()) {
            logger.warn("You haven't added any toys yet!");

            return;
        }

        for (Toy toy : toyList) {
            logger.info(toy.toString());
        }

        logger.info("----------------------------");

    }

    public void showToy(Optional<Toy> toy) {

        if (toy.isPresent()) {
            logger.info(toy.toString());
        }else {
            logger.error("Toy with that id doesn't exist.");
        }

        logger.info("----------------------------");

    }

    public void sortToysByName() {
        //This method sorts list of toys by name

        Collections.sort(toys, new NameComparator());

    }

    public void sortToysById() {
        //This method sorts list of toys by id

        Collections.sort(toys, new IdComparator());

    }
    public void sortToysByNamePriceId() {
        /**This method sorts list of vegetables by name, then by
         * price and then by id
         */
        Comparator<Toy> comparator = new PriceComparator().
                                            thenComparing(new NameComparator()).
                                            thenComparing(new IdComparator());
        Collections.sort(toys, comparator);
    }

}