package labs_examples.input_output.examples.csv_parser;

import labs_examples.packages.labs.Property;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PropertyParser {


    public static void main(String[] args) {

        ArrayList properties = new ArrayList();

        String filePath = "/Users/johncommon/Documents/JAVA/PROPERTYFILE1";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                //line.split dot operator allows for usiing any separator
                properties.add(mapValuesToPropertyObject(values));
            }
        } catch (FileNotFoundException fNFexc) {
            // file exception
            fNFexc.printStackTrace();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
        for(Property :properties) {

            // Not sure why properties is being such a pain in the ass! It's in scope of Main method

            System.out.println(Property.toString());
        }
    }




    private static Property mapValuesToPropertyObject(String[] values){
        Property property = new Property();

        property.setAddress(String.[0]);
        property.setLevels(values[1]);
        property.setSquareFootage(values[2]);
        property.setLotSize(values[3]);
        property.setPrice(values[4]);

        return property;

    }
}

