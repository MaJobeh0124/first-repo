public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double baseProduction = 221 * speed;

        double successRate;
        if (speed >= 1 && speed <= 4){
            successRate = 1.00;
        }else if (speed >= 5 && speed <= 8){
            successRate = 0.90;
        }else if (speed == 9){
            successRate = 0.80;
        }else if (speed == 10){
            successRate = 0.77;
        }else {
            successRate = 0.00;
        }
        return baseProduction * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        double hourlyRate = productionRatePerHour(speed);
        return (int) (hourlyRate / 60);
    }
}
