public class Bottle {
    private double capacity;
    private double amountOfWater;
    int bottleId = 0;
    private static final String AFTER_THIS = "After this, the water capacity of the bottle ";

    Bottle(double capacity, int bottleId) {
        this.bottleId = bottleId;
        amountOfWater = 0;
        this.capacity = capacity;
        System.out.println("The capacity of bottle " + bottleId + " is " + capacity + ". There is " + amountOfWater + " water.");
    }

    boolean pour(double refilled) {
        System.out.println("You are trying to pour " + refilled + " water into a bottle " + this.bottleId + ". There is " + this.amountOfWater + " water.");
        if (capacity >= amountOfWater + refilled) {
            amountOfWater += refilled;
            System.out.println(AFTER_THIS + this.bottleId + " is: " + amountOfWater);
            return true;
        }
        else
            System.out.println("You are trying to pour too much!!! You can pour " + (capacity - amountOfWater));
            return false;
    }
    boolean pourOut(double quantity) {
        System.out.println("You are trying to pour out " + quantity + " water into a bottle " + this.bottleId + ". There is " + this.amountOfWater + " water.");
        if (amountOfWater > quantity) {
            amountOfWater -= quantity;
            System.out.println(AFTER_THIS + this.bottleId + " is: " + amountOfWater);
            return true;
        }
        else
            System.out.println("You are trying to pour out too much water!!! You can pour out " + (this.capacity - this.amountOfWater) + " water from bottle " + this.bottleId + " and you are trying to pour out " + quantity + " water.");
            return false;
    }
    boolean pourOver(Bottle bottle, double quantity) {
        System.out.println("You are trying to pour over " + quantity + " water from bottle " + this.bottleId + " into bottle " + bottle.bottleId + ".");
        if (this.amountOfWater > quantity && bottle.capacity >= bottle.amountOfWater + quantity) {
            this.amountOfWater -= quantity;
            bottle.amountOfWater += quantity;
            System.out.println(AFTER_THIS + this.bottleId + " is " + this.amountOfWater + " and the water capacity of the bottle " + bottle.bottleId + " is " + bottle.amountOfWater);
            return true;
        }
        else if (this.amountOfWater < quantity) {
            System.out.println("You are trying to pour out too much water!!! You have " + this.amountOfWater + " water in bottle " + this.bottleId + " and you are trying to pour out " + quantity);
            return false;
        }
        else if (bottle.capacity < bottle.amountOfWater + quantity) {
            System.out.println("You are trying to pour too much!!! You can pour " + (bottle.capacity - bottle.amountOfWater) + " to bottle " + bottle.bottleId);
            return false;
        }
        else return false;
    }

    public double getAmountOfWater() {
        System.out.println("There is " + this.amountOfWater + " of water in the bottle " + this.bottleId + ".");
        return amountOfWater;
    }
}
