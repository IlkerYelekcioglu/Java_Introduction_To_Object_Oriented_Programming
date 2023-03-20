public class WideningConversion {
    public static void main(String args[]) {
        byte b = 126;
        short s = 1000;
        char c = 65;
        int i = 2_147_483_647;
        long l;
        float f = 3.14f;
        double d;
        /*
         * c = b; // compile (derleyici)
         * c = s; // compile(derleyici)
         * i = d; // compile (derleyici)
         */
        s = b;
        l = i;
        // Loss of precision
        f = i;
        System.out.println("i: " + i + " f: " + f);

        l = i + 1;
        System.out.println("i: " + i + " l: " + l);
        System.out.println();

        l = 987_654_321_123_456_789L;
        f = l;
        System.out.println("l: " + l + " f: " + f);

        d = l;
        System.out.println("l: " + l + " d: " + d);

        d = f;
        System.out.println("f: " + f + " d: " + d);

        i = c;
        System.out.println("c: " + c + " i: " + i);
        d = i;
        System.out.println("i: " + i + " d: " + d);
    }
}


