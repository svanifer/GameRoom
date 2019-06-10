package edu.epam.training.oophomework.main;

import edu.epam.training.oophomework.Specification.ToySpecificationById;
import edu.epam.training.oophomework.Specification.ToySpecificationByPriceRange;
import edu.epam.training.oophomework.ToyRepository.ToyRepository;
import edu.epam.training.oophomework.entity.Toy;
import edu.epam.training.oophomework.util.ArrayConverter;
import edu.epam.training.oophomework.util.Creator;
import edu.epam.training.oophomework.util.DataReader;
import java.util.List;
import java.util.Optional;
import edu.epam.training.oophomework.util.RoomWorker;
import org.apache.log4j.Logger;

public class Logic {

    final static Logger logger = Logger.getLogger(Logic.class);

    public static void main(String[] args) {


        logger.info("Room is prepering.");

        final String FILENAME = "source/set.txt";

        DataReader dataReader = new DataReader();
        String[] lines = dataReader.lineRead(FILENAME);
        ArrayConverter arrayConverter = new ArrayConverter();
        List<String[]> parameter = arrayConverter.convertArrayToString(lines);
        Creator creator = new Creator();
        List<Toy> toyset = creator.makeToys(parameter, 70);
        ToyRepository repository = new ToyRepository(toyset);
        RoomWorker worker = new RoomWorker(repository.getToySet());
        worker.sortToysById();
        worker.showToys();
        worker.sortToysByName();
        worker.showToys();
        worker.sortToysByNamePriceId();
        worker.showToys();
        Optional<Toy> toy = repository.findToyById(new ToySpecificationById(5));
        worker.showToy(toy);
        worker.showToys(repository.findToysByPrice(new ToySpecificationByPriceRange(5, 8)));
    }
}
