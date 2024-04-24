package Week03Project_계산기;

public class Calculator2 {

    private AbstractOperation operation;

    public Calculator2(AbstractOperation operation) {
        this.operation = operation;
    }

    public double Calculate(int firstNumber, int secondNumber) {
        double result = operation.operate(firstNumber, secondNumber);
        return result;
    }
}

