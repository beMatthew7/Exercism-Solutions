
public class Lasagna {
    private static final int EXPECTED_MINUTES_IN_OVEN = 40;

    private static final int EXPONENT = 2;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return EXPECTED_MINUTES_IN_OVEN;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int time){
        return expectedMinutesInOven() - time;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return EXPONENT * layers;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int totalTime){
        return preparationTimeInMinutes(layers) + totalTime;
    }
}
