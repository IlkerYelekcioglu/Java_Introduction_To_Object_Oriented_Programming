package init.initializers;

public class InitializerMethods {
    boolean isOpen = isDoorOpen();
//	boolean isOpen = isDoorOpenStatic();

//	static double pi = getPi();
    static double pi = getPiStatic();

//	int i = j;


    int i = getJ(); // i = 0;
    int j = 10;

    public static void main(String[] args) {
        InitializerMethods demo = new InitializerMethods();
        System.out.println("i: " + demo.i);
        System.out.println("j: " + demo.j);
        System.out.println("isOpen: " + demo.isOpen);
        System.out.println("Pi: " + pi);
        System.out.println(demo.getPi());
    }

    double getPi() {
        return Math.PI;
    }

    static double getPiStatic() {
        return Math.PI;
    }

    boolean isDoorOpen() {
        if (i > pi)
            return true;
        else
            return false;
    }

    static boolean isDoorOpenStatic() {
        return true;
    }

    public int getJ() {
        return j;
    }
}
