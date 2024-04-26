package NBCamp.week04.계산기예외처리;

// 나누기
public class DivideOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}
