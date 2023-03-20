package constant;

public class Car {
    String make;
    String model;
    String year;
    int speed;
    int distance;

    String owner;

    public void speedUp(final int newSpeed){
        speed = newSpeed;
    }
    public void setOwner(final String newOwner){
       owner = newOwner;
    }
}
