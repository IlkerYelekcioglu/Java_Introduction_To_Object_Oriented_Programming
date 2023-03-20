public class TernaryOperator {
    public static void main(String[] args){
        basics();
        ifElseEquivalnce();
        evaluation();
        hard();
        errors();
    }

    public static void basics() {
        int i = 18;
        int j = 11;
        int min = (i <= j) ? i : j;
        System.out.println("Min: " + min );

        System.out.println((i<=j) ? "true" : "false");
        System.out.println(!(i <= j) ? "true" :"false" );

        int x = 0;
        int y = 5;
        int z = 9;

        int t = x == 2 ? y : z;
        System.out.println(t);
    }
    public static void ifElseEquivalnce(){
      int i = 8;
      int j = 11;
      int min = (i <= j) ? i : j ;
      System.out.println("Min: " + min);
      if(i <= j)
         System.out.println(i);
      else
          System.out.println(j);

      String string1 = "I love Java very much";
      String string2 = "I love nothing!";
      String string3 = (string1.matches(".*Java.*")) ? string1 : string2;

      System.out.println("String3: " +string3);

      if (string1.matches(".*Java.*"))
          string3=string1;
      else
          string3 = string2;
      System.out.println("String3: " +string3);
    }
    public static void evaluation(){
        System.out.println(true ? "true" :false);
        System.out.println(false ? "true" : false);

        System.out.println(true ? returnTrue() : returnFalse());
        System.out.println(false ? returnTrue() : returnFalse());
    }
    private static String returnTrue(){
        System.out.println("in returnTrue()");
        return "true";
    }
    private static String returnFalse(){
        System.out.println("in returnFalse()");
        return "false";
    }
    public static void hard() {
        boolean b = false;

        int x = (int) (Math.random() * 1000);
        int y = (int) (Math.random() * 1000);
        int z = (int) (Math.random() * 1000);

        System.out.println("x: " + x + "y: " + y + "z: " + z);

        b = x < y ? x < z ? true : false : false;
        System.out.println(b);

        b = x < y ? (x < z ? true : false) : false;
        System.out.println(b);
    }
        public static void errors(){
        int i = 8;
        int j = 11;

        //(i<j) ? System.out.println(i) : System.out.println(j);

         int x = 0;
         int y;
         int z;

        // (x == 2 ? y : z ) = 5;
        }
}
