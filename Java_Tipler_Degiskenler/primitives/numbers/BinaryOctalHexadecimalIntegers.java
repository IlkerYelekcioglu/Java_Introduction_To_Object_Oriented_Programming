package numbers;

public class BinaryOctalHexadecimalIntegers {
    public static void main(String[] args) {

        int num1 = 0b1010;
        int num2 = 0132;
        int num3 = 0x5a;

        long num4 = 0b1010L;
        byte num5 = 017;
        short num6 = 0x5a;

        System.out.println(num1 + " " + num2 + " " + num3);
        System.out.println(num4 + " " + num5 + " " + num6);

        int num7 = num1 + num2 + num3;
        int num8 = num1 * num2 * num3;

        System.out.println(num7);
        System.out.println(num8);

		Integer anInt = Integer.decode("8");
//
//		System.out.println(anInt);
    }
}
