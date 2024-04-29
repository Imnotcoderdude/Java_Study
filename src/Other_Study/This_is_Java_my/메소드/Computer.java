package Other_Study.This_is_Java_my.메소드;
// 가변길이 메소드
public class Computer {
    //가변길이의 매개변수를 갖는 메소드 선언
    int sum(int ... values){
        int sum = 0; // sum 변수 선언

        // values는 배열 타입의 변수처럼 사용할 수 있음
        for (int i = 0; i < values.length; i++) {
            sum += values[i]; // sum = sum + values[i] 와 같은 의미
        }
        return sum;
    }
}
