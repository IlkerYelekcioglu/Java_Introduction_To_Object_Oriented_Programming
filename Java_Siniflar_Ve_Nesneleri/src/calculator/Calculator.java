package calculator;

public class Calculator {
    String name;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    void whoYouAre(){
        System.out.println("I'm a Calculator,my name is " + name);
    }
    public int add(int first,int second){
        return first + second;
    }
    public int subtract(int first,int second){
        return first -second;
    }
    public int multiply(int first,int second){
        int sum = first *second;
        return sum;
    }
    public int multiplyByAdding(int first,int second){
        int multiplication = 0;
        for(int i = 1; i <= second;i++)
            multiplication += first;
        System.out.println("Multiplication: " +multiplication);
        return multiplication;
    }
    public double divide(int first,int second){
        return (double) first/second;
    }
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.setName("Texas Instruments T-308");

        calculator.whoYouAre();

        int i = calculator.add(14,25);
        System.out.println("14 + 25 = " +i);

        double d = calculator.divide(73,9);
        System.out.println("82 / 9 = " + d);

        System.out.println("95 - 68 = " + calculator.subtract(95,68));
        System.out.println("17 * 18 = " + calculator.multiply(17,18));

        calculator.multiplyByAdding(24,5);

    }
}
