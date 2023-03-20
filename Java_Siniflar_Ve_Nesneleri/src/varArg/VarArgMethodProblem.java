package varArg;

    public class VarArgMethodProblem {
        public static void main(String[] args) {

            int a[] = { 2, 3 };


            f(a);

            f(4);

            f(4, 5);


        }


        public static void f(int ... args) {
            System.out.println("f(int ... args)");
        }
 /*

	public static void f(int ... args, int k) {
		System.out.println("f(int ... args)");
	}


	public static void f(int i, int ... args) {
		System.out.println("f(int i, int ... args)");
	}

	public static void f(int i, int j, int... args) {
		System.out.println("f(int i, int ... args)");
	}
    */
}