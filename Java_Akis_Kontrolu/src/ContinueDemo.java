public class ContinueDemo {
    public static void main(String[] args){
        for(int i = 1; i <= 5; ++i){
            if(i==4)
                continue;
            System.out.println(i + "\t" + Math.sqrt(i));
        }
    }
}
