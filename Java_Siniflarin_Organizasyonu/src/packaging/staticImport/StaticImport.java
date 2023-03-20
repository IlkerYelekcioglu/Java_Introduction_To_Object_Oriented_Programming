package packaging.staticImport;
import  static java.lang.Math.*;
import Java_Siniflarin_Organizasyonu.packaging.staticImport.AClass.*;
import static java.lang.Math.pow;
import static java.lang.Math.PI;
public class StaticImport {
    public static void main(String[] args) {
        System.out.println(A_CONSTANT);
        System.out.println(aStaticVariable);
        aStaticMethod();

        System.out.println();

        System.out.println(Math.PI + " " + PI);
        System.out.println(Math.pow(2, 10) + " " + pow(2,10));

        System.out.println(PI + " " + PI);
        System.out.println(pow(2, 10) + " " + pow(2,10));
    }
}
