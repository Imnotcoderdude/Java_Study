package Other_Study.This_is_Java_my.메소드.오버로딩;

public class CalculatorExample {
    public static void main(String[] args) {
        // 객체 생성
        Calculator calc = new Calculator();
        // 정사각형의 넓이 구하기.
        double result1 = calc.areaReactangle(10);
        // 직사각형의 넓이 구하기
        double result2 = calc.areaReactangle(10,5);

        System.out.println("정사각형의 넓이 : " + result1);
        System.out.println("직사각형의 넓이 : " + result2);

    }
}
