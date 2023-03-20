package init;

public class FinalInitialization {
    public static void main(String[] args) {

    }
}

class A {

    final int i;
    String name;

    static final int s;

    {
        i = 11;
    }

    static
    {
        s = 17;
    }

    A() {
        this(5);
    }

    A(int i) {

    }

    A(String name) {
        this.name = name;

    }
}
