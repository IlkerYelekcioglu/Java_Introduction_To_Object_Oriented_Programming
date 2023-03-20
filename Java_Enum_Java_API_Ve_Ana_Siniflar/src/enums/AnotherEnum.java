package enums;

public enum AnotherEnum {

    CONSTANT;
    int i;
    static String s;

    public static void main(String[] args) {
        System.out.println("Selam");
        CONSTANT.i = 10;
        System.out.println(CONSTANT.i);
        s = "enum :)";
        System.out.println(s);
    }

}

//enum X extends AnotherEnum{
//
//}

