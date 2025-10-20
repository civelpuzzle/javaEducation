package pz9;

public class NoDiscount implements PriceStrategy{

    @Override
    public double getPrice(double basePrice, int days){return basePrice * days;}
}
