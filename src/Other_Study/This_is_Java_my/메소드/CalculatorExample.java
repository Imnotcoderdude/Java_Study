package Other_Study.This_is_Java_my.메소드;

public class CalculatorExample {
    public static void main(String[] args) {
        // Calculator 객체 생성하는 부분
        Calculator calc = new Calculator();

        // 리턴타입이 없는 powerOn 메소드 호출
        calc.powerOn();


        // 리턴 타입이 int 인 plus 메소드 호출
        int result1 = calc.plus(5,6); // x, y 에 값 대입
        System.out.println("결과 : " + result1);

        int x = 10; // x, y 에 값 할당
        int y = 4;
        double result2 = calc.divide(x, y); // 할당된 값을 이용하기 위해 변수 int 형 변수 x,y 사용
        System.out.println("결과 2 : " + result2); // 자동 형 변환을 통해 double 형으로 변환됨

        calc.powerOff();
    }
}
