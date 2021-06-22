package labs_examples.objects_classes_methods.labs.oop.RealEstate.src.com.JohnCommon;

import labs_examples.objects_classes_methods.labs.oop.RealEstate.src.com.JohnCommon.DevelopedProperty;

public class Commercial extends DevelopedProperty {
    String commercialPropertyType;

    public Commercial(String propertyStreetAddress, String propertyType, boolean developed, int lotSize, String apn, String locationCity, String locationCounty, String locationZipCode, String locationZoning, String propertyDescription, boolean commercial, String commercialType, int buildingInteriorSquareFootage, short levels, boolean parking, int price, double vacancyRatePercentage, int numberOfTenants, boolean rental, int parkingSpaces, String commercialPropertyType) {
        super(propertyStreetAddress, propertyType, developed, lotSize, apn, locationCity, locationCounty, locationZipCode, locationZoning, propertyDescription, commercial, commercialType, buildingInteriorSquareFootage, levels, parking, price, vacancyRatePercentage, numberOfTenants, rental, parkingSpaces);
        this.commercialPropertyType = commercialPropertyType;
    }
}
