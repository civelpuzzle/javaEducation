package pz9;

public class Main {
    public static void main(String[] args){

        Car c1 = CarFactory.createCar("Economy");
        Car c2 = CarFactory.createCar("Luxury");

        PriceStrategy p1 = new Discount(10);
        PriceStrategy p2 = new PromoDiscount(500);
        PriceStrategy p3 = new NoDiscount();

        int day = 10;

        TotalPrice t1 = new TotalPrice(c1, p1);
        TotalPrice t2 = new TotalPrice(c2, p2);
        TotalPrice t3 = new TotalPrice(c1, p3);

        print(c1, t1, day);
        print(c2, t2, day);
        print(c1, t3, day);
    }

    static void print(Car car, TotalPrice totalPrice, int days){
        System.out.println(
                "Тип авто: " + car.getType() +
                        "\nСтартовая цена: " + car.getRate() +
                        "\nИтоговая цена: " + totalPrice.getTotalPrice(days)
        );
    }
}
