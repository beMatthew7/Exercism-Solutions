
public class Lasagna {
    private static final int EXPECTED_MINUTES_IN_OVEN = 40;

    private static final int EXPONENT = 2;
    public int expectedMinutesInOven(){
        return EXPECTED_MINUTES_IN_OVEN;
    }
    public int remainingMinutesInOven(int time){
        return expectedMinutesInOven() - time;
    }

    public int preparationTimeInMinutes(int layers){
        return EXPONENT * layers;
    }
    public int totalTimeInMinutes(int layers, int totalTime){
        return preparationTimeInMinutes(layers) + totalTime;
    }
}
