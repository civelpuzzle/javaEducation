package pz9;

public abstract class Car {

    private String type;
    private int rate;

    public Car(String type, int rate){
        this.type = type;
        this.rate = rate;
    }

    public String getType(){return type;}
    public int getRate(){return rate;}
}
