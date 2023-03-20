public class Blocks {
    long l;

    {

    }
    // Declaration block

    {
        boolean b;
    }
    // Initialization block
    {
        //b = true;
        l = 17L;
    }
    // Definition block
    {
        int i = 6;
    }
  public static void main(String[] args)  {

        Blocks bd = new Blocks();
        System.out.println(bd.l);

      {
          int a = 5;
          System.out.println(a);
      }
      bd.c();
  }
    // Inner class block
    class InnerClass{}

    // Method block
    public void c(){

        new Blocks(){
            public void sop(){
                // Local class block
                System.out.println(l);
            }
        };
    }
}
