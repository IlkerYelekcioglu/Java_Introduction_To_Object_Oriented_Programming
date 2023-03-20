package constant;

public class FinalParameter {
    public static void main(String[] args){
        final Car car;

        car = new Car();
        car.make = "BMW";
        car.model = "X1";
        car.year = "2018";
        car.speed = 90;
        car.distance = 22_500;

        car.speedUp(120);
        car.setOwner("İlker");
    }
}
