package inheritance.hiding;

public class Child extends Parent{
    protected int i;
    protected byte b;
    protected double d;

    public Child(int i1, boolean b1, int i2, byte b2, double d) {
//		super(i1, b1);
        super();
        super.i = i1;
        super.b = b1;
        i = i2;
        b = b2;
        this.d = d;
    }


    public static void g() {
        System.out.println("g() in Child");
    }

    /*
	public void g() {

	}

	public static void f() {
	System.out.println("g() in Child");

	}
*/

    public void printInfo() {
        System.out.println("\nChild Info: ");
        System.out.println("i: " + i);
        System.out.println("super.i: " + super.i);
        System.out.println("b: " + b);
        System.out.println("super.b: " + super.b);
        System.out.println("d: " + d);
        g();
        System.out.println();
        super.g();
        Parent.g();
    }

    public void printInfoUsingSuper() {
        System.out.println("\nChild Info Using Super: ");
        System.out.println("i: " + i);
        System.out.println("b: " + b);
        System.out.println("d: " + d);
        g();

        super.printInfo();
    }
}
