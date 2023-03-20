package loop;

public class ComplexWhile {
    public static void main(String[] args){
        System.out.println("First while");
        int i = (int) (10*Math.random());
        int j = (int) (10*Math.random());
        boolean b = i > j;

        while(b = !b)
            System.out.println("i: " + i + "j: " + j);

        System.out.println("\nSecond While");

        while (b = i > j ? true : false){
            System.out.println("i: " + i + "j: " + j);
            i = (int) (10*Math.random());
            j = (int) (10*Math.random());
        }
        System.out.println("\nThird While");

        while (b = getBoolean()){
            i = (int) (10*Math.random());
            j = (int) (10*Math.random());
        }
    }
    public static boolean getBoolean(){
        boolean b;
        return b = Math.random()> 0.5 ? true : false;
    }
}