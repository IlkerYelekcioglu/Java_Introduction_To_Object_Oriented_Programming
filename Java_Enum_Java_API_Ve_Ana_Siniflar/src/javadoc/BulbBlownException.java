package javadoc;

public class BulbBlownException  extends Exception{
    private static String text = "Bulb is blown! ";

    public BulbBlownException(int luminescence){
        super(text + "Luminescence that blew the bulb: " + luminescence);
    }
}
