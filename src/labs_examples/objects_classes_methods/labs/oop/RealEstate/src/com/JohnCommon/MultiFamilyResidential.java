package labs_examples.objects_classes_methods.labs.oop.RealEstate.src.com.JohnCommon;

public class MultiFamilyResidential extends com.JohnCommon.ResidentialProperty {
    boolean onSiteManagement;

    public MultiFamilyResidential(String propertyStreetAddress, String propertyType, boolean developed, int lotSize, String apn, String locationCity, String locationCounty, String locationZipCode, String locationZoning, String propertyDescription, boolean commercial, String commercialType, int buildingInteriorSquareFootage, short levels, boolean parking, int price, double vacancyRatePercentage, int numberOfTenants, boolean rental, int parkingSpaces, String residentailPropertyType, boolean gatedCommunity, boolean hoa, boolean secondHoa, String hoaName, String secondHoaName, int hoaFees, int secondHoaFees, boolean view, boolean pool, boolean spa, boolean attachedGarage, boolean onSiteManagement) {
        super(propertyStreetAddress, propertyType, developed, lotSize, apn, locationCity, locationCounty, locationZipCode, locationZoning, propertyDescription, commercial, commercialType, buildingInteriorSquareFootage, levels, parking, price, vacancyRatePercentage, numberOfTenants, rental, parkingSpaces, residentailPropertyType, gatedCommunity, hoa, secondHoa, hoaName, secondHoaName, hoaFees, secondHoaFees, view, pool, spa, attachedGarage);
        this.onSiteManagement = onSiteManagement;
    }
}
