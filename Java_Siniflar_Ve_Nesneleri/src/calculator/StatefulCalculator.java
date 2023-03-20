package calculator;

public class StatefulCalculator {
    String name;

    int firstArgument;
    int secondArgument;
    double result;
    char operation;

    Calculator calculator = new Calculator();

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    void whoAreYou() {
        System.out.println("I'm a Calculator, my name is " + name);
    }

    public int getFirstArgument() {
        return firstArgument;
    }

    public void setFirstArgument(int newFirstArgument) {
        firstArgument = newFirstArgument;
    }

    public int getSecondArgument() {
        return secondArgument;
    }

    public void setSecondArgument(int newSecondArgument) {
        secondArgument = newSecondArgument;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char newOperation) {
        operation = newOperation;
    }

    public double getResult() {
        switch(operation){
            case '+':	result = calculator.add(firstArgument, secondArgument); break;
            case '-':	result = calculator.subtract(firstArgument, secondArgument); break;
            case '*':	result = calculator.multiply(firstArgument, secondArgument); break;
            case '/':	result = calculator.divide(firstArgument, secondArgument); break;
        }

        return result;
    }

    public static void main(String[] args) {
        StatefulCalculator calculator = new StatefulCalculator();

        int a = 19;
        int b = 54;

        calculator.setFirstArgument(a);
        calculator.setSecondArgument(b);
        calculator.setOperation('*');
        double result = calculator.getResult();

        System.out.println("Result: " + result);
        System.out.println(calculator.getFirstArgument() + " " + calculator.getOperation() + " " + calculator.getSecondArgument() + " = " + result);

        calculator.setFirstArgument(67);
        calculator.setSecondArgument(64);
        calculator.setOperation('/');
        result = calculator.getResult();
        System.out.println("Result: " + result);
        System.out.println(calculator.getFirstArgument() + " " + calculator.getOperation() + " " + calculator.getSecondArgument() + " = " + result);
    }
}
