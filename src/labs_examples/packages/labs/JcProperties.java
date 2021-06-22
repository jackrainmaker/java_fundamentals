package labs_examples.packages.labs;

public class JcProperties {

    public static void main(String[] args) {
        pricePerFootBuilding(200000, 3700);
        pricePerFootLot(200000, 18000);



    }

        protected static int levels;
        protected static int squareFootage;
        protected static int lotSize;
        protected static int price;

    public JcProperties( int levels, int squareFootage, int lotSize, int price){
            this.levels = levels;
            this.squareFootage = squareFootage;
            this.lotSize = lotSize;
            this.price = price;

        }

        public static int pricePerFootBuilding(int price, int squareFootage){
            return price / squareFootage;
        }

        public static int pricePerFootLot(int price, int lotSize){
            return price / lotSize;
        }

    }

