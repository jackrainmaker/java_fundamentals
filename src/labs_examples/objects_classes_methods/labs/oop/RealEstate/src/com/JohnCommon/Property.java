package com.JohnCommon;

    public class Property {

        String propertyStreetAddress;
        String propertyType;
        boolean developed;

        public boolean isDeveloped() {
            return developed;
        }
        int lotSize;
        String apn;
        String locationCity;
        String locationCounty;
        String locationZipCode;
        String locationZoning;
        String propertyDescription;

        public Property(String propertyStreetAddress, String propertyType, boolean developed, int lotSize, String apn, String locationCity, String locationCounty, String locationZipCode, String locationZoning, String propertyDescription) {
            this.propertyStreetAddress = propertyStreetAddress;
            this.propertyType = propertyType;
            this.developed = developed;
            this.lotSize = lotSize;
            this.apn = apn;
            this.locationCity = locationCity;
            this.locationCounty = locationCounty;
            this.locationZipCode = locationZipCode;
            this.locationZoning = locationZoning;
            this.propertyDescription = propertyDescription;
        }
    }
