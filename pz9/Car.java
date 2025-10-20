package pz9;

public abstract class Car {

    private String type;
    private double rate;

    public Car(String type, double rate){
        this.type = type;
        this.rate = rate;
    }

    public String getType(){return type;}
    public double getRate(){return rate;}
}
