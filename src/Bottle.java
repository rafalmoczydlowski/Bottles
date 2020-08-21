public class Bottle {

    private double capacity;
    private double amountOfWater;
    int bottleId = 0;

    private static final String AFTER_THIS = "After this, the water capacity of the bottle ";
    private static final String POUR_OUT = "You are trying to pour out too much water!!! You can pour out ";
    private static final String POUR_OUT_2 = " and you are trying to pour out ";
    private static final String POUR = "You are trying to pour too much!!! You can pour ";
    private static final String WATER = " water from bottle ";

    Bottle(double capacity, int bottleId) {
        this.bottleId = bottleId;
        amountOfWater = 0;
        this.capacity = capacity;
        System.out.println("The capacity of bottle " + bottleId + " is " + capacity + ". There is " + amountOfWater + " water.");
    }

    boolean pour(double quantity) {
        System.out.println("You are trying to pour " + quantity + " water into a bottle " + this.bottleId + ". There is " + this.amountOfWater + " water.");
        if (this.capacity >= this.amountOfWater + quantity) {
            this.amountOfWater += quantity;
            System.out.println(AFTER_THIS + this.bottleId + " is: " + this.amountOfWater);
            return true;
        }
        else
            System.out.println(POUR + (capacity - amountOfWater));
            return false;
    }
    boolean pourOut(double quantity) {
        System.out.println("You are trying to pour out " + quantity + " water into a bottle " + this.bottleId + ". There is " + this.amountOfWater + " water.");
        if (this.amountOfWater >= quantity) {
            this.amountOfWater -= quantity;
            System.out.println(AFTER_THIS + this.bottleId + " is: " + this.amountOfWater);
            return true;
        }
        else
            System.out.println(POUR_OUT + this.amountOfWater + WATER + this.bottleId + POUR_OUT_2 + quantity + " water.");
            return false;
    }
    void pourOver(Bottle destBottle, double quantity) {
        System.out.println("You are trying to pour over " + quantity + WATER + this.bottleId + " into bottle " + destBottle.bottleId + ".");
        if (this.amountOfWater >= quantity && destBottle.capacity >= destBottle.amountOfWater + quantity) {
            this.pourOut(quantity);
            destBottle.pour(quantity);
        }
        else if (destBottle.capacity < destBottle.amountOfWater + quantity) {
            System.out.println(POUR + (destBottle.capacity - destBottle.amountOfWater) + " water into bottle " + destBottle.bottleId);
        }
        else if (this.amountOfWater < quantity) {
            System.out.println(POUR_OUT + this.amountOfWater + WATER + this.bottleId + POUR_OUT_2 + quantity + " water.");
        }
    }

    public double getAmountOfWater() {
        System.out.println("There is " + this.amountOfWater + " of water in the bottle " + this.bottleId + ".");
        return amountOfWater;
    }
}
