package javadoc;

public class Bulb {

    public static final int STANDARD_MAX_LUMINESCENCE = 90;
    String name;
    private int currentLuminescence;
    protected int maxLuminescence;


    public Bulb() {
        maxLuminescence = STANDARD_MAX_LUMINESCENCE;
        currentLuminescence = 0;
        System.out.println("A bulb with max luminescence of " + maxLuminescence + " created.");
    }


    public Bulb(int maxLuminescenceValue) {
        maxLuminescence = maxLuminescenceValue;
        currentLuminescence = 0;
        name = "bulb" + new String((new Integer(maxLuminescence)).toString());
        System.out.println("A bulb " + name + " with max luminescence of " + maxLuminescence + " created.");
    }


    public void setMaxLuminescence(int value) throws IllegalArgumentException {
        if (value <= 0) {
            throw new IllegalArgumentException("Luminescence value passed must be greater than zero: " + value);
        }
        maxLuminescence = value;
    }


    public int getMaxLuminescence() {
        return maxLuminescence;
    }


    public void on() {
        currentLuminescence = maxLuminescence;
        System.out.println("Bulb  " + this.name + " is on now");
    }


    public void off() {
        currentLuminescence = 0;
        System.out.println("Bulp  " + this.name + " off now");
    }


    public void brighten() {
        System.out.println("Bulb  " + this.name + " is brighter now");
    }


    public void brighten(int value) throws IllegalArgumentException, BulbBlownException {
        if (value <= 0) {
            throw new IllegalArgumentException("Luminescence value passed must be greater than zero: " + value);
        }

        if (currentLuminescence < value) {
            if (value <= maxLuminescence) {
                currentLuminescence = value;
                System.out.println("Luminescence of " + this.name + " is increased to " + currentLuminescence);
            } else {
                throw new BulbBlownException(value);
            }
        } else {
            System.out.println("Do you want to make " + this.name + " brighter or dimmer?");
            System.out.println("Current luminescence of " + this.name + " is " + currentLuminescence);
            System.out.println("You tried to brighten it to " + value);
        }
    }


    public void dim() {
        System.out.println("Bulb  " + this.name + " is dimmer now");
    }

    public void dim(int value) throws IllegalArgumentException {
        if (value <= 0) {
            throw new IllegalArgumentException("Luminescence value passed must be greater than zero.");
        }

        if (currentLuminescence > value) {
            if (value >= 0) {
                currentLuminescence = value;
                System.out.println("Luminescence of " + this.name + " is decreased to " + currentLuminescence);
            } else {
                System.out.println("Don't be that silly! I am just a bulb not a black hole");
            }
        } else {
            System.out.println("Do you want to make " + this.name + " brighter or dimmer?");
            System.out.println("Current luminescence of " + this.name + " is " + currentLuminescence);
            System.out.println("You tried to dim it to " + value);
        }
    }
}
