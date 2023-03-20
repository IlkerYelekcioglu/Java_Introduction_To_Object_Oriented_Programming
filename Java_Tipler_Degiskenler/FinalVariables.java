import car.Car;
public class FinalVariables {
    public static void main(String[] args){

        final int i = 9;
        System.out.println(i);


        final long l;
        //System.out.println(l);
        l=6;

        System.out.println(l);

        int x = 3 ;
        int y = 8;
        final int j;

        if(x>y)
            j=11;
        else
            j=9;

        System.out.println(j);

       final Car c1 = new Car();
       //c1 = new Car();

       final Car c2;
       c2 = new Car();
       //c2= new Car();
    }
}
