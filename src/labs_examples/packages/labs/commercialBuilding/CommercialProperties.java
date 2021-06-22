package labs_examples.packages.labs.commercialBuilding;


import labs_examples.packages.labs.JcProperties;

public class CommercialProperties extends JcProperties {
    boolean elevator;
    boolean parking;
    int numberParkinSpaces;

    public CommercialProperties(int levels, int squareFootage, int lotSize, int price) {
        super(levels, squareFootage, lotSize, price);
    }
}

