package labs_examples.objects_classes_methods.labs.oop.RealEstate.src.com.JohnCommon;

public class DevelopedProperty extends com.JohnCommon.Property {
    boolean commercial;
    String commercialType;
    int buildingInteriorSquareFootage;
    short levels;
    boolean parking;
    int price;
    double vacancyRatePercentage;
    int numberOfTenants;
    boolean rental;

    public boolean isRental() {
        return rental;
    }

    public static int priceperfoot(int buildingInteriorSquareFootage, int price) {
        return price / buildingInteriorSquareFootage;
    }



    public boolean isParking() {
        return parking;
    }
    int parkingSpaces;


    public DevelopedProperty(String propertyStreetAddress, String propertyType, boolean developed, int lotSize, String apn, String locationCity, String locationCounty, String locationZipCode, String locationZoning, String propertyDescription, boolean commercial, String commercialType, int buildingInteriorSquareFootage, short levels, boolean parking, int price, double vacancyRatePercentage, int numberOfTenants, boolean rental, int parkingSpaces) {
        super(propertyStreetAddress, propertyType, developed, lotSize, apn, locationCity, locationCounty, locationZipCode, locationZoning, propertyDescription);
        this.commercial = commercial;
        this.commercialType = commercialType;
        this.buildingInteriorSquareFootage = buildingInteriorSquareFootage;
        this.levels = levels;
        this.parking = parking;
        this.price = price;
        this.vacancyRatePercentage = vacancyRatePercentage;
        this.numberOfTenants = numberOfTenants;
        this.rental = rental;
        this.parkingSpaces = parkingSpaces;
    }

}
