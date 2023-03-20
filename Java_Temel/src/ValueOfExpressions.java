public class ValueOfExpressions {
    public static void main(String[] args){
        int a=  2_147_483_647; //  javadaki maximum limit tamsayı değeri
        int b = a + 1;

        System.out.println(b);

        int d = 14;
        int e;
        if (d < 11)
            e = 7;

        System.out.println();

        // e may not have been initialized!
        // System.out.println(e);


    }
}
