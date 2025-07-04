public class ChocolateFactory {

    public enum ChocolateType{WHITE, MILK, DARK};
    public enum Packaging{REGULAR, LUX};

    public static ChocolateType chocolateType(int temperature){
        ChocolateType type;

        if(temperature > 100 && temperature < 110){ // less or equal for 100
            type = ChocolateType.WHITE;
        } else if(temperature > 110 && temperature < 125){
            type = ChocolateType.MILK;
        } else {
             type = ChocolateType.DARK;
        }

        return type;
    }

    public static double chocolatePrice(ChocolateType type, Packaging packaging, boolean hazelnuts){
        double price = 0;

        if (type == ChocolateType.MILK){
            price = 150;

            if(hazelnuts == true){
                price = 200;
            }

        } else if(type == ChocolateType.DARK){
            price = 300;

        }

        if(packaging == Packaging.LUX){
            price *= 1.5;
        }

        return price;
    }



}
