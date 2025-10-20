package pz9;

public class TotalPrice {

    private Car car;
    private PriceStrategy priceStrategy;

    public TotalPrice(Car car, PriceStrategy priceStrategy){
        this.car = car;
        this.priceStrategy = priceStrategy;
    }

    public double getTotalPrice(int days){
        return priceStrategy.getPrice(car.getRate(), days);
    }
}
