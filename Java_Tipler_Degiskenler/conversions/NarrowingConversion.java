public class NarrowingConversion {
    public static void main(String[] args){
        System.out.println();
        byte b = 0;
        short s = 1000;
        char c;
        int i = -200;
        long l = 10_000_000_000l;
        //float  f = 65.999_999f;
        float f = 65.5541_233f;
        double d = 98.014_353_459_485_483d;

        // b = s // derleyici hatası
        // c = i // derleyici hatası
        // f = d // derleyici hatası
        //System.out.println(f);

        b = (byte) s;
        System.out.println("s: " + s + "\t\t\tb: " + b);


        b = (byte) s;
        System.out.println("s: " + s + "\t\t\tb: " + b);

        i = (int) l; 	// Bilgi Kaybı
        System.out.println("l: " + l + "\t\ti: " + i);

        i = (int) d;
        System.out.println("d: " + d + "\ti: " + i);

        i = (int) f;  	// Float nokta kaybı
        System.out.println("f: " + f + "\t\ti: " + i);

        l = (long) f;	// Float nokta kaybı
        System.out.println("f: " + f + "\t\tl: " + l);

        f = (float) d;	// Bilgi Kaybı
        System.out.println("d: " + d + "\tf: " + f);

        i= 65;
        c = (char) i;
        System.out.println("i: " + i + "\t\t\tc: " + c);

        i= -i;
        c = (char) i;  // Problem!
        System.out.println("i: " + i + "\t\t\tc: " + c);

        byte b1 = -10;
        char c1 = (char) b1;
        System.out.println("b1: " + b1 + "\t\t\tc1: " + (int)c1 + "\t\t\tc1: " + c1);


    }
}
