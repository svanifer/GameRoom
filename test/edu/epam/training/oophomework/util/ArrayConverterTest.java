package edu.epam.training.oophomework.util;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class ArrayConverterTest {

    ArrayConverter converter = new ArrayConverter();

    @Test
    public void convertArrayToStringEmptyArray(){
        String[] s = new String[0];
        assertEquals(converter.convertArrayToString(s).isEmpty(), true);
    }

    @Test
    public void convertArrayToStringArrayWithData(){
        String[] s = new String[]{"Car small 7"};
        assertEquals(converter.convertArrayToString(s).isEmpty(), false);
    }
}