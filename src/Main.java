public class Main {
    public static void main(String [] args) {
        Bottle bottle1 = new Bottle(1.5, 1);
        Bottle bottle2 = new Bottle(3.0, 2);

        bottle1.pour(1.5);
        bottle2.pour(1.5);
        bottle2.pourOver(bottle1,1.5);
        bottle1.getAmountOfWater();
        bottle2.getAmountOfWater();
    }
}
