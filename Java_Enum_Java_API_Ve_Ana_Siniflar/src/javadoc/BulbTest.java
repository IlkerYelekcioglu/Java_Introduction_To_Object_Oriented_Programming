package javadoc;

public class BulbTest {

    public static void main(String args[]) throws IllegalArgumentException, BulbBlownException {
        Bulb bulb = new Bulb();
        bulb.setMaxLuminescence(100);
        int lum = bulb.getMaxLuminescence();
        System.out.println(lum);
        System.out.println(bulb.getMaxLuminescence());

        Bulb bulb100 = new Bulb(150);
        Bulb bulb80 = new Bulb(60);

        bulb100.brighten(80);
        bulb80.brighten(48);
        bulb100.brighten(64);
        bulb80.brighten();
        bulb100.dim(60);
        bulb80.dim();
        bulb100.dim(90);
        bulb100.brighten(160);
        bulb100.dim(90);
    }
}
