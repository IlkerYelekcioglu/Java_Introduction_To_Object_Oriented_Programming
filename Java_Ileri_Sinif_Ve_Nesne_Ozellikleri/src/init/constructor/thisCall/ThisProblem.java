package init.constructor.thisCall;

public class ThisProblem {
    String name;
    int count;

    public ThisProblem() {
        this("ThisProblems");
//		this(3);
    }

    public ThisProblem(String name) {
//		this(name, 5);
    }

    public ThisProblem(int count) {
        this.count = count;
    }

    public ThisProblem(String name, int count) {
//		this(name);
    }
}
