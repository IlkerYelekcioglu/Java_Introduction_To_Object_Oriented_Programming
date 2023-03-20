package string;

public class StringTest {

    public static void main(String[] args) {
        String s = new String("İlker");
        s += "Yelekçioğlu";
        s += " :)";

        StringBuilder sb = new StringBuilder("İlker");
        sb.append("Yelekçioğlu");
        sb.append(" :)");
        String s2 = sb.toString();
        System.out.println(s + " \n" + s2);
    }
}
