package edu.epam.training.oophomework.util;

import edu.epam.training.oophomework.validator.DataValidor;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

//This class converts array of strings to array of objects
public class ArrayConverter {

    final static Logger logger = Logger.getLogger(ArrayConverter.class);

    public List<String[]> convertArrayToString(String[] lines){
        final String SPLITER = "\\s+";
        DataValidor dataValidor = new DataValidor();
        List<String[]> parameter = new ArrayList<>();

        if (lines.length == 0){
            logger.error("Array from DataReader was empty.");
        }
        for (int i = 0; i < lines.length; i++){
            String[] dividedLines = lines[i].split(SPLITER);

            if(dividedLines.length == 3 && dataValidor.nameValidation(dividedLines[0])
                    && dataValidor.sizeValidation(dividedLines[1]) && dataValidor.intValidation(dividedLines[2])){

                String[] s = new String[3];
                s[0] = dividedLines[0];
                s[1] = dividedLines[1];
                s[2] = dividedLines[2];
                parameter.add(s);
            }
        }

        return parameter;
    }
}
