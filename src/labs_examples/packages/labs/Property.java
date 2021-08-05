package labs_examples.packages.labs;

public class Property {

    public static void main(String[] args) {

    }

    protected static String address;
    protected static int levels;
    protected static int squareFootage;
    protected static int lotSize;
    protected static int price;

    public Property() {
    }

    public Property(String address, int levels, int squareFootage, int lotSize, int price) {
        this.address = address;
        this.levels = levels;
        this.squareFootage = squareFootage;
        this.lotSize = lotSize;
        this.price = price;

    }

    public static String getaddress() {
        return address;
    }


    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Property.address = address;
    }

    public static int getLevels() {
        return levels;
    }

    public static void setLevels(String levels) {
        Property.levels = levels;
    }

    public static int getSquareFootage() {
        return squareFootage;
    }

    public static void setSquareFootage(String squareFootage) {
        Property.squareFootage = squareFootage;
    }

    public static int getLotSize() {
        return lotSize;
    }

    public static void setLotSize(String lotSize) {
        Property.lotSize = lotSize;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(String price) {
        Property.price = price;
    }

    protected static int pricePerFootBuilding(int price, int squareFootage) {
        return price / squareFootage;
    }

    protected static int pricePerFootLot(int price, int lotSize) {
        return price / lotSize;
    }

    @Override
    public static String toString() {
        return "Property Address " + address + '\'' +
                "levels=" + levels + '\'' +
                ", squareFootage=" + squareFootage + '\'' +
                ", lotSize='" + lotSize + '\'' +
                ", price" + price;
    }

}

