public class AssignmentOperator {
    public static void main(String[] args){
        int i = 3;
        int j = (i = 5);
        System.out.println(j);

        boolean b1,b2;
        b1=(b2=true);
        System.out.println(b1);

        i = i+3;
        System.out.println(i);

        i +=3;
        System.out.println(i);

        i-=4;
        System.out.println(i);

        i/=7;
        System.out.println(i);

    }
}
