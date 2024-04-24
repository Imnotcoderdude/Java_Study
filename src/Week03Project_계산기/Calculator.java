package Week03Project_계산기;

public class Calculator {

    private AbstractOperation operation;

    public Calculator (AbstractOperation operation) {
        this.operation = operation;
    }

    public void setOperation (AbstractOperation operation) {
        this.operation = operation;
    }

    public double Calculate(int firstNumber, int secondNumber) {
        double result = 0;
        result = operation.operate(firstNumber, secondNumber);
        return result;
    }
}

