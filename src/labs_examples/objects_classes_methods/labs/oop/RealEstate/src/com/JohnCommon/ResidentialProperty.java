package com.JohnCommon;

import labs_examples.objects_classes_methods.labs.oop.RealEstate.src.com.JohnCommon.DevelopedProperty;

public class ResidentialProperty extends DevelopedProperty {
    String residentailPropertyType;
    boolean gatedCommunity;
    boolean hoa;
    boolean secondHoa;
    String hoaName;
    String secondHoaName;
    int hoaFees;
    int secondHoaFees;
    boolean view;
    boolean pool;
    boolean spa;
    boolean attachedGarage;

    public boolean isPool() {
        return pool;
    }

    public boolean isSpa() {
        return spa;
    }

    public boolean isView() {
        return view;
    }

    public boolean isAttachedGarage() {
        return attachedGarage;
    }

    public boolean isHoa() {
        return hoa;
    }

    public boolean isGatedCommunity() {
        return gatedCommunity;
    }

    public boolean isSecondHoa() {
        return secondHoa;
    }

    public ResidentialProperty(String propertyStreetAddress, String propertyType, boolean developed, int lotSize, String apn, String locationCity, String locationCounty, String locationZipCode, String locationZoning, String propertyDescription, boolean commercial, String commercialType, int buildingInteriorSquareFootage, short levels, boolean parking, int price, double vacancyRatePercentage, int numberOfTenants, boolean rental, int parkingSpaces, String residentailPropertyType, boolean gatedCommunity, boolean hoa, boolean secondHoa, String hoaName, String secondHoaName, int hoaFees, int secondHoaFees, boolean view, boolean pool, boolean spa, boolean attachedGarage) {
        super(propertyStreetAddress, propertyType, developed, lotSize, apn, locationCity, locationCounty, locationZipCode, locationZoning, propertyDescription, commercial, commercialType, buildingInteriorSquareFootage, levels, parking, price, vacancyRatePercentage, numberOfTenants, rental, parkingSpaces);
        this.residentailPropertyType = residentailPropertyType;
        this.gatedCommunity = gatedCommunity;
        this.hoa = hoa;
        this.secondHoa = secondHoa;
        this.hoaName = hoaName;
        this.secondHoaName = secondHoaName;
        this.hoaFees = hoaFees;
        this.secondHoaFees = secondHoaFees;
        this.view = view;
        this.pool = pool;
        this.spa = spa;
        this.attachedGarage = attachedGarage;
    }
}
