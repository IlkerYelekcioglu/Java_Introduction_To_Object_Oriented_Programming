package thisKeyword;

public class ThisDemo {

    int i = 0;
    int k = 5;
    int j = 2 * this.k;

    public ThisDemo() {
    }

    public ThisDemo(int i, int k, int j) {
        this.i = i;
        this.k = k;
        this.j = j;
    }

    void setI(int i) {
        this.i = i;
    }

    void aMethod() {
        this.printMe();
    }

    void printMe() {
        System.out.println(this.i + " " + this.j + " " + this.k);
    }

    public static void main(String[] args) {
        ThisDemo demo2 = new ThisDemo(3, 5, 8);
        demo2.aMethod();
    }
}

