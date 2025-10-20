package pz9;

public class Discount implements PriceStrategy{

    private double discount;

    public Discount(double discount){this.discount = discount;}

    @Override
    public double getPrice(double basePrice, int days){
        return basePrice * days * (1 - discount / 100);
    }
}
