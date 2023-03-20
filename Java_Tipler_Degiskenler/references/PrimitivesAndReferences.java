public class PrimitivesAndReferences {
    public static void main(String[] args) {

        // İlk  primitive değişkenler
        int i = 5;
        int j = i;
        i = 7;
        System.out.println("i: " + i + " \t " + " j: " + j); // j is still 5

        System.out.println();

        // Then referans değişkenler

        String s1 = new String("http://www.JavaTurk.org"); // s1 => "http://www.JavaTurk.org"
        String s2 = new String("http://java.sun.com"); // s2 => "http://java.sun.com"

        System.out.println("Before switch => s1: " + s1 + " \t " + "s2: " + s2);

        // Let's switch referans

        String tmp = s1;
        // tmp => "http://www.JavaTurk.org",İki referans vardır
        // "http://www.JavaTurk.org"
        s1 = s2;
        // s1 => "http://java.sun.com" , İki referans vardır.
        // "http://java.sun.com", sadece bir referans var "http://www.JavaTurk.org"
        s2 = tmp;
        // s2 => "http://www.JavaTurk.org", İki referans vardır
        // "http://www.JavaTurk.org", sadece bir referans var "http://java.sun.com"
        System.out.println("After switch  => s1: " + s1 + " \t " + "s2: " + s2);

        System.out.println();

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2 + " \t " + "tmp: " + tmp);
        System.out.println("s2  starts with " + s2.charAt(0) + " and ends with " + s2.charAt(s2.length()-1));
        System.out.println("tmp starts with " + tmp.charAt(0) + " and ends with " + tmp.charAt(tmp.length()-1));

        System.out.println();

        //Aynı türde yeni nesneler atanabilir
        s2 = new String("http://www.oracle.com/technetwork/java/index.html");
        System.out.println("s2: " + s2 + " \t " + "tmp: " + tmp);
    }
}
