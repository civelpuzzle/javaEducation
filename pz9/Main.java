package pz9;

public class Main {
    public static void main(String[] args){

        Car c1 = CarFactory.createCar("Economy");
        Car c2 = CarFactory.createCar("Luxury");

        PriceStrategy p1 = new Discount(10);
        PriceStrategy p2 = new PromoDiscount(500);
        PriceStrategy p3 = new NoDiscount();


    }
}
