package labs_examples.packages.labs;

public class Property {



    protected String address;
    protected int levels;
    protected int squareFootage;
    protected int lotSize;
    protected int price;


    public Property(String address, int levels, int squareFootage, int lotSize, int price) {
        this.address = address;
        this.levels = levels;
        this.squareFootage = squareFootage;
        this.lotSize = lotSize;
        this.price = price;
    }

    public Property() {

    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Property Address " + address + '\'' +
                "levels=" + levels + '\'' +
                ", squareFootage=" + squareFootage + '\'' +
                ", lotSize='" + lotSize + '\'' +
                ", price" + price;
    }
}

