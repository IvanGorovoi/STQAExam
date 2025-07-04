import java.util.ArrayList;

public class Laundromat {

    public enum Coin{NICKEL, TENNER, QUARTER, FIFTYCENTS};
    public enum WashingMode{WHITE, COLORS, DELICATE};

    public static double startWashing(Coin[] coins){
        double washingTimeInMinutes = 0;
        for(int i = 0; i < coins.length; i++){
            washingTimeInMinutes += switch(coins[i]){
                case NICKEL -> 1;
                case TENNER -> 2;
                case QUARTER -> 15;
                case FIFTYCENTS -> 30;
            };
        }

        return washingTimeInMinutes;
    }

}
