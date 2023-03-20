public class BreakDemo {
    public static void main(String[] args) {
        for(int i=1; i <= 5 ; i++){
            if(i==4)
                break;
            System.out.println(i + "\t" + Math.sqrt(i));
        }
        System.out.println("I'm here");
    }
}