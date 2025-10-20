package pz9;

public class PromoDiscount implements  PriceStrategy{

    private double promo;

    public PromoDiscount(double promo){this.promo = promo;}

    @Override
    public double getPrice(double basePrice, int days) {
        double total = basePrice * days - promo;
        return total > 0 ? total : 0;
    }
}
