package edu.epam.training.oophomework.util;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import static org.testng.Assert.assertEquals;

public class CreatorTest {

    Creator creator = new Creator();

    @Test
    public void makeToysWithParametersAndPrice(){

        List<String[]> param = new ArrayList<String[]>();
        param.add(new String[]{"Ball", "big", "9"});
        int roomPrice = 20;
        assertEquals(creator.makeToys(param, roomPrice).isEmpty(), false);
    }
    @Test
    public void makeToysWithParameters(){

        List<String[]> param = new ArrayList<String[]>();
        param.add(new String[]{"Ball", "big", "9"});
        int roomPrice = 0;
        assertEquals(creator.makeToys(param, roomPrice).isEmpty(), true);
    }
    @Test
    public void makeToysWithPrice(){

        List<String[]> param = new ArrayList<String[]>();
        int roomPrice = 0;
        assertEquals(creator.makeToys(param, roomPrice).isEmpty(), true);
    }
}