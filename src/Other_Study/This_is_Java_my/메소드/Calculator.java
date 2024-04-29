package Other_Study.This_is_Java_my.메소드;

public class Calculator {
    // 리턴값이 없는 powerOn 메소드 선언
    void powerOn() {
        System.out.println("전원이 켜졌습니다");
    }
    // 마찬가지로 리턴값 없는 메소드선언
    void powerOff() {
        System.out.println("전원이 꺼졌습니다.");
    }
    // 호출시 두 정수 값을 전달받고, 호출한 곳으로 결과값 int를 리턴하는 메소드 선언
    int plus(int x, int y) {
        int result = x + y;
        return result; // 리턴값을 지정한 부분
    }
    // 호출시 두 정수 값을 전달받고, 호출한 곳으로 결과값 double를 리턴하는 메소드 선언
    double divide(int x, int y) {
        double result = (double)x / (double)y;
        return result; // 리턴값을 지정한 부분
    }
}
