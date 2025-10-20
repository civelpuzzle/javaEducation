package pz9;

public class CarFactory {

    public static Car createCar(String type){
        switch (type){
            case "Economy":
                return new EconomyCar();
            case "Luxury":
                return new LuxuryCar();
            default:
                throw new IllegalArgumentException("Unknown car type");
        }
    }
}
