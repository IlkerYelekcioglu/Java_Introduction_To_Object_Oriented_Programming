public class BinaryPromotion {
    public static void main(String[] args){
        byte b1 = 5;
        byte b2 = 8;

        byte b3 = (byte) (b1*b2);

        System.out.println(b3);

        byte b = 3;

        byte c = (byte) (b >>> b);
    }
}
