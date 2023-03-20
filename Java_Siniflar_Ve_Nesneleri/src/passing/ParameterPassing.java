package passing;

public class ParameterPassing {
    public void f(A aa){
        aa.i++;
    }
    public void f(int j){
        j++;
    }
    public static void main(String[] args){
        ParameterPassing o = new ParameterPassing();

        int i = 5;
        System.out.println("i: " + i);
        o.f(i);
        System.out.println("i: " + i);

        System.out.println();

        A a = new A();
        System.out.println("a.i: " + a.i);
        o.f(a);
        System.out.println("a.i: " + a.i);


    }
}

class A{
    int i = 5;
}