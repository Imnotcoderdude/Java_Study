package NBCamp.week04.계산기예외처리;

// 더하기
public class AddOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
