package init.initializers;
import java.util.Random;
public class InitializerBlocks {
    double d;

    {
        System.out.println("\nIn an instance initializer block-1.");
        d = calculateD();
    }

    int l;

    {
        long l = 5;
        System.out.println("\nIn an instance initializer block-2.");
        Random random = new Random();
        l = random.nextLong();
        this.l = (int) (Math.abs(l) % 100);
    }

    static int i;

    static {
        System.out.println("In a static initializer block.");
        double d = Math.random();
        int i;
        if (d < 0.5) {
            i = 5;
        } else
            i = 10;
        InitializerBlocks.i = i;
    }

    static int[] ints = new int[10];

    static {
        System.out.println("\nInitializing the static array.");
        for (int i = 0; i < ints.length; i++)
            ints[i] = (i + 1) * 10;
    }

    String s;

    {
        s = new String("Javaaaa!");
    }

    double calculateD() {
        return Math.random() * 10;
    }

    void printInfo() {
        System.out.println("\nVariables");
        System.out.println("d: " + d);
        System.out.println("l: " + l);
        System.out.println("i: " + i);
        System.out.println("\nArray");
        for (int i : ints)
            System.out.print(i + " ");
        System.out.println("\ns: " + s);
    }

    public static void main(String[] args) {
        new InitializerBlocks();
        new InitializerBlocks();
        InitializerBlocks ib = new InitializerBlocks();
//		ib.printInfo();
    }
}
