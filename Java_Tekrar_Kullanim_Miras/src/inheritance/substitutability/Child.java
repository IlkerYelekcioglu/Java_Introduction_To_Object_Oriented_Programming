package inheritance.substitutability;

public class Child extends Parent {
    /*
   	protected int i = 5;
	protected boolean b = true;
	protected static String s = "Child";
*/
    private int i = 5;
    private boolean b = true;
    private static String s = "Child";

    public static void f(){
        System.out.println("f() in Child");
    }

    public void g() {
        System.out.println("g() in Child");
    }
}
