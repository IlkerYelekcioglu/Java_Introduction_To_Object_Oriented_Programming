package inheritance.hiding;

public class SuperExample {
    public static void main(String[] args) {
        B b = new B();
        b.printInfo();
    }
}

class A {
    static int i = 7;
    int j = 9;

    static void f() {
        System.out.println("in f() of A");
    }

    void g() {
        System.out.println("in g() of A");
    }
}

class B extends A {
    /*
   	static int t = 2 * super.i;
	static double t = 2 * i;
    */
    static double t = 2 * A.i;
    static double i = 17d;
    int j = 19;
    int k;
    int l;
    int m = 2 * super.i;

    static
    {
//		i = 2 * super.j;
    }

    {
        k = super.j;
    }

    public B() {
        l = 2 * super.j;
    }

    static void f() {
        System.out.println("in f() of B");
        /*
		super.f();
		A.f();

         */
    }

    public void printInfo() {
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("k: " + k);
        System.out.println("l: " + l);
        System.out.println("m: " + m);
        System.out.println("t: " + t);
        System.out.println("super.i: " + super.i);

        System.out.println();

        f();
        this.f();
        A.f();

        System.out.println();

        super.f();
        A.f();

        System.out.println();

        A a = new A();
        a.g();
        super.g();

        /*
		receiveParent(super);
		receiveParent(this.super);
         */
    }

    void receiveParent(A a){
        System.out.println("in receiveParent()");
    }

    /*
	A getParent(){
		return super;
	}
    */
}
