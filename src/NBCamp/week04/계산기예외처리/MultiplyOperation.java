package NBCamp.week04.계산기예외처리;

// 곱하기
public class MultiplyOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
