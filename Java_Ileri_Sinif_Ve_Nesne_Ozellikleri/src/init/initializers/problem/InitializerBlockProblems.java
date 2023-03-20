package init.initializers.problem;

public class InitializerBlockProblems {
    static {
//		i = j + 2;
        j = 10;
//		i = j + 2;
    }

    static {
//		k = k+1;
//		k++;
    }
    static int i, j, k;

    static {
        j = 4;
    }

    static boolean[] b;

    static{
//		 b = {true, true, false};
    }

    int t = 10;

    static double f;

    static {
//		f = t * Math.random();
    }
}
