package com.JohnCommon;

public class JCProperties {

    public static void main(String[] args) {




    }

    protected static int levels;
    protected static int squareFootage;
    protected static int lotSize;
    protected static int price;

    public JCProperties( int levels, int squareFootage, int lotSize, int price){
        this.levels = levels;
        this.squareFootage = squareFootage;
        this.lotSize = lotSize;
        this.price = price;

    }

    protected static int pricePerFootBuilding(int price, int squareFootage){
        return price / squareFootage;
    }

    protected static int pricePerFootLot(int price, int lotSize){
        return price / lotSize;
    }

}

