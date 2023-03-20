package tree;

public class TreeWithThis {
    private String type;
    private float height;

    public TreeWithThis(String type, float height) {
        System.out.println("\n in TreeWithThis(String, int)");
        this.type = type;
        this.height = height;
        System.out.println(height);
    }

    public TreeWithThis(String newType) {

        this(newType, 1.0f);
        System.out.println("\n in TreeWithThis(String)");
    }

    public TreeWithThis(float newHeight) {

        this("Pine", newHeight);
        System.out.println("\n in TreeWithThis(int)");
    }

    public void printInfo(){
        System.out.println("\nTreeWithThis Info:");
        System.out.println("Type: " + type);
        System.out.println("Height: " + height);
    }

    public static void main(String[] args) {
        TreeWithThis tree1 = new TreeWithThis("Pine", 2.0f);
        tree1.printInfo();

        TreeWithThis tree2 = new TreeWithThis("Oak");
        tree2.printInfo();

        TreeWithThis tree3 = new TreeWithThis(8.0f);
        tree3.printInfo();
    }
}
