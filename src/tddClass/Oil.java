package tddClass;

public class Oil {

    private int litre;
    private double amount;
    private int fuelPrice = 200;
    private double discount = 0.02;

    public void buyFuel(double litre) {
       this.amount = (litre * fuelPrice) - (litre * fuelPrice * discount);
    }

    public double getAmount() {
        return amount;
    }
}
