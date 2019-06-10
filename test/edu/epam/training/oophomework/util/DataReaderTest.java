package edu.epam.training.oophomework.util;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class DataReaderTest {

    DataReader reader = new DataReader();

    @Test
    public void lineReadNoFile(){
        String fileName = "source/s.txt";

        assertEquals(reader.lineRead(fileName).length, 0);

    }

    @Test
    public void lineReadEmptyFile(){
        String fileName = "source/emp.txt";

        assertEquals(reader.lineRead(fileName).length, 0);

    }

    @Test
    public void lineReadFileWithData(){
        String fileName = "source/set.txt";

        assertEquals(reader.lineRead(fileName).length > 0, true);

    }
}