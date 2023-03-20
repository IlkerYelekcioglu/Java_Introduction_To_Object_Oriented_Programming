package thisKeyword;

public class ThisTree {
    String type;
    float height;

    public ThisTree(String type, float height) {
        this.type = type;
        this.height = height;
    }

    public void printInfo() {
        System.out.println("\nTree Info:");
        this.printType();
        this.printHeight();
    }

    public void printType() {
        System.out.println("Type: " + this.type);
    }

    public void printHeight() {
        System.out.println("Height: " + this.height);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public static void main(String[] args) {
        ThisTree tree = new ThisTree("Cinar", 12.0f);
        tree.printInfo();
    }
}
