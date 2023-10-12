package homework6;

public class Plate {
    private int foodAmountMax;
    private int foodAmountCurrent;

    public Plate(int foodAmountMax) {
        this.foodAmountMax = foodAmountMax;
        this.foodAmountCurrent = foodAmountMax;
    }

    public void info() {
        System.out.println("Максимальное кол-во еды: " + foodAmountMax + "\nТекущее кол-во еды: " + foodAmountCurrent);
    }


    public int getFoodAmountCurrent() {
        return foodAmountCurrent;
    }

    public void addFood(int foodAmount) {
        foodAmountCurrent = foodAmount;
        if (foodAmountCurrent > foodAmountMax) {
            foodAmountCurrent = foodAmountMax;
        }
    }

    public boolean decreaseFood(int appetite) {
        if (foodAmountCurrent >= appetite) {
            foodAmountCurrent -= appetite;
            return true;
        } else {
            return false;
        }
    }
}
