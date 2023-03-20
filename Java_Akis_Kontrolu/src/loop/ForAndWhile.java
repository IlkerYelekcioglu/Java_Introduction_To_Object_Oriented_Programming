package loop;

public class ForAndWhile {
    public static void main(String[] args){
        double r = Math.random();
        System.out.println("r: " + r );

        System.out.println("while");
        while (r < 0.8) {
            r = Math.random();
            System.out.println(r);
        }

        r = Math.random();
        System.out.println("for");
        for(int i = 0; i>= 0; i++){
            r = Math.random();
            System.out.println(r);
            if(r>=0.8d)
                i = -2;
        }
    }
}
