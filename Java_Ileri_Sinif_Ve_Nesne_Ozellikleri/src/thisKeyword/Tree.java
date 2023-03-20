package thisKeyword;

public class Tree {
    String type;
    float height;

    public Tree(String type, float height) {
        this.type = type;
        this.height = height;
    }

    public Tree copy() {
        Tree copyTree = new Tree(type, height);
        return copyTree;
    }

    public Tree grow() {
        height++;
        return this;
    }

    public void printInfo() {
        System.out.println("\nTree Info:");
        System.out.println("Type: " + type);
        System.out.println("Height: " + height);

    }

    public static void main(String[] args) {
        Tree tree = new Tree("Pine", 15.0f);
        tree.printInfo();

        Tree copyTree = tree.copy();
        copyTree.printInfo();

        System.out.println();


        if (tree == copyTree)
            System.out.println("The same");
        else
            System.out.println("Different");

        tree.grow().grow().grow().printInfo();

        Tree grownTree = tree.grow();
        grownTree.printInfo();

        System.out.println();


        if (tree == grownTree)
            System.out.println("The same");
        else
            System.out.println("Different");
    }
}

