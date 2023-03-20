package init.initializers.problem;
import java.time.LocalTime;
public class InitializationProblem4 {
    String name;

    double coefficient = LocalTime.now().isBefore(LocalTime.NOON) ? 2 : 4;

    static int[] ints = new int[10];

    InitializationProblem4() {
        name = "default";
    }

    InitializationProblem4(String name) {
        this.name = name;
/*
		System.out.println("\nInitializing the static array.");
		for (int i = 0; i < ints.length; i++)
			ints[i] = (i + 1) * 10;

 */
    }

    static void initializeArray() {
        System.out.println("\nInitializing the static array.");
        for (int i = 0; i < ints.length; i++)
            ints[i] = (i + 1) * 10;
    }

    public static void main(String[] args) {
        initializeArray();

        System.out.println();

        for(int i : ints)
            System.out.print(i + " ");

        System.out.println("\n");

        System.out.println(new InitializationProblem4().coefficient);
    }
}
