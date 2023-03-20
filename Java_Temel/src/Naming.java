
public class Naming {
    private int anIntegerVariable;
    private double aDoubleVariable;

    public static void main(String[] args) {
        Naming namingDemo = new Naming();
        namingDemo.anIntegerVariable = 95;
        namingDemo.aDoubleVariable = 0.43;
        namingDemo.aSimpleMethod(4, 7);
        namingDemo.anotherSimpleMethod(8, 5, false);
    }

    public void aSimpleMethod(int aParameter, int anotherParameter){
        System.out.println("in aSimpleMethod(int aParameter, int anotherParameter)");
    }

    public void anotherSimpleMethod(int aParameter, long anotherParameter, boolean yetAnotherParameter){
        System.out.println("in anotherSimpleMethod(int aParameter, long anotherParameter, boolean yetAnotherParameter)");
    }
}