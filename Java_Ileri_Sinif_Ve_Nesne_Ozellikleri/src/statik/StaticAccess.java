package statik;

public class StaticAccess {
    static int i = 10;
    int j = 10;

    public static void main(String args[]) {

        System.out.println("StaticAccess.i: " + i);
        System.out.println("StaticAccess.i: " + StaticAccess.i);

        StaticAccess.increaseI(9);

        System.out.println("StaticAccess.i: " + StaticAccess.i);

        increaseI(17);

    }

    static void increaseI(int i) {
        StaticAccess.i = i;
        i++;
        StaticAccess.i++;
        System.out.println("Local i: " + i);
        System.out.println("StaticAccess's i: " + StaticAccess.i);
        aMethod();
    }

    static void aMethod() {
        System.out.println("in aMethod()");
    }

    void increaseJ(int j) {
        this.j = j;
        j++;
        this.j++;
        System.out.println("local j: " + j);
        System.out.println("Instance's j: " + this.j);
        aMethod();
    }
}