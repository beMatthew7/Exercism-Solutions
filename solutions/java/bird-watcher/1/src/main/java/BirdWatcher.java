
class BirdWatcher {
    private final int[] birdsPerDay;
    private static final int BUSY_DAY = 5;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
         return  birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int c : birdsPerDay){
            if(c == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalSum = 0;
        for(int i = 0; i < Math.min(numberOfDays, birdsPerDay.length); i++){
            totalSum += birdsPerDay[i];
        }
        return totalSum;
    }

    public int getBusyDays() {
        int count = 0;
        for(int c : birdsPerDay){
            if(c >= BUSY_DAY){
                count++;
            }
        }
        return count;
    }
}
