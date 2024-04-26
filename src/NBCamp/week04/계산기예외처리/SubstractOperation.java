package NBCamp.week04.계산기예외처리;

// 빼기
public class SubstractOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
