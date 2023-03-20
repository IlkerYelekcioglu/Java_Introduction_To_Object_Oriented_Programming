package init.initializers.problem;

public class ForwardReferences {
    //	int i = j;
//	int j= 10;

    //	static int k = l;
    static int l = 10;

    int i = j;
    static int j = 10;

    static {
        t = 10;
        u = 8;
    }
    static int t, u;

    static {
//		v = w;
    }
    static int v, w;

    static {
//		x = y;
    }
    static {
//		y = x;
    }
    static int x, y;

    int a;
    //int b;
    {
//		a = b;
        b = 10;
    }
    int b;
}
