package inheritance.access.protect;

public class AccessTest {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Child Info");
        System.out.println("child.x: " + child.x);
//		System.out.println("child.y: " + child.y);
//		System.out.println("child.t: " + child.t);
//		System.out.println("z: " + z); // z is private
    }
}
