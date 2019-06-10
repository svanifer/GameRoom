package edu.epam.training.oophomework.util;

import edu.epam.training.oophomework.comparator.PriceComparator;
import edu.epam.training.oophomework.entity.Toy;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class Creator {

    final static Logger logger = Logger.getLogger(Creator.class);

    public List<Toy> makeToys (List<String[]> parameter, int roomPrice){

        int totalPrice = 0;
        int id = 1;
        List<Toy> toyList = new ArrayList<>();

        if (parameter.isEmpty()){
            logger.error("List from ArrayConverter was empty.");
        }

        for (int i = 0; i < parameter.size(); i++){

            if((totalPrice + Integer.parseInt(parameter.get(i)[2])) <= roomPrice && roomPrice != 0){
                try {
                    toyList.add(ToyFactory.createToyFromFactory(
                            id, parameter.get(i)[0], parameter.get(i)[1],
                            Integer.parseInt(parameter.get(i)[2])));
                    id++;
                    totalPrice += Integer.parseInt(parameter.get(i)[2]);
                }catch (NoSuchElementException e){
                    logger.error("Toy with that name doesn't exist!", e);
                }
            }
            if(!toyList.isEmpty()){
                Collections.sort(toyList, new PriceComparator());

                if(i == parameter.size() - 1 && toyList.get(0).getPrice() <= roomPrice - totalPrice){
                    i = 0;
                }
            }
        }
        return toyList;
    }
}
