package string;

public class StringJoin {
    public static void main(String[] args) {
        String names1 = String.join(" and ", "İlker", "Ali", "49", "50");
        System.out.println(names1);

        String[] names2 = {"Dilara", "Fatma", "Ayse"};
        String nameList = String.join(", ",names2);
        System.out.println(nameList);
    }
}
