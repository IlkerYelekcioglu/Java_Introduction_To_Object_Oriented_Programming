package composition;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X1", "2017", 4);
        car.start();
        car.go(1000);
        car.accelerate(100);
        car.stop();
        car.turnOff();
    }
}
