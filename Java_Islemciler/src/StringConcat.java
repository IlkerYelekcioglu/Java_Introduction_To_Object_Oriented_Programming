public class StringConcat {
    private static String world = "Millet";
    private static String smiley = ":)";
    public static void main(String[] args) {

        String selam = "Selam" + world + smiley;
        System.out.println("Selam" + selam);


        System.out.println("Java" + 1 + 2);     //Java12
        System.out.println("Java" + (1+2));     //Java
        System.out.println( 1 + 2 + "Java");    //3Java

    }
}