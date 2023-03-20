package init;

public class InitialValues {

    boolean t;
    char c;
    byte b;
    short s;
    int i ;
    long l;
    float f;
    double d;
    String str;

    void print(){
        System.out.println(
        "Data type      Initial values for instance variables\n" +
        "boolean        " + t + "\n" +
        "char           [" + c + "] "+ (int)c +"\n"+
        "byte           " + b + "\n" +
        "short          " + s + "\n" +
        "int            " + i + "\n" +
        "long           " + l + "\n" +
        "float          " + f + "\n" +
        "double         " + d + "\n" +
        "String         " + str + "\n"
        );
    }
    public static void main(String[] args){
        InitialValues object = new InitialValues();
        object.print();
    }
}
