package labs_examples.packages.labs.commercialBuilding;


import labs_examples.packages.labs.JcProperties;


public class CommercialProperties extends JcProperties {
    boolean elevator;
    boolean parking;
    int numberParkinSpaces;

    public CommercialProperties(int levels, int squareFootage, int lotSize, int price, boolean elevator, boolean parking, int numberParkinSpaces) {
        super(levels, squareFootage, lotSize, price);
        this.elevator = elevator;
        this.parking = parking;
        this.numberParkinSpaces = numberParkinSpaces;
    }



    public static void main(String[] args) {
        try {
            int pPFB = pricePerFootBuilding(200000, 0);
            int pPFL = pricePerFootLot(200000, 18000);
            System.out.println("Price price per foot lot is = $" + pPFL + ". Price per square foot building is $" + pPFB);
        } catch(ArithmeticException badZero) {
            System.out.println("Lot size or building square footage cannot be Zero");
        }

        System.out.println("process completed");

        CommercialProperties bridgeViewRd = new CommercialProperties(4,12000,37000,12000000,true,true,112);



    }
}

