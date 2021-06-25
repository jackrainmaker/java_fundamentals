package labs_examples.packages.labs.singleFamilyResidence;

import labs_examples.packages.labs.JcProperties;

public class Sfr extends JcProperties {
    int bedrooms;
    double bathrooms;
    String constructionType;
    boolean pool;
    boolean spa;
    int garage;

    public Sfr(int levels, int squareFootage, int lotSize, int price, int bedrooms, double bathrooms, String constructionType, boolean pool, boolean spa, int garage) {
        super(levels, squareFootage, lotSize, price);
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.constructionType = constructionType;
        this.pool = pool;
        this.spa = spa;
        this.garage = garage;
    }

    public static void main(String[] args) {
        try {
            int pPFB = pricePerFootBuilding(361800, 0);
            int pPFL = pricePerFootLot(361800, 6897);
            System.out.println("Price per square foot building =$" + pPFB + ". Price per foot lot =$" + pPFL + ".");
        } catch (ArithmeticException badZero) {
            System.out.println("Lot size or building square footage cannot be Zero");
        }
        System.out.println("Just finished");
    }
}