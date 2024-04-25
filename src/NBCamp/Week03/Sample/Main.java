package NBCamp.Week03.Sample;

public class Main { // 메인이라는 클래스를 인스턴스화를 시킨 다음에 그다음에 메소드를 써보자
    public static void main(String[] args) {
         Main main = new Main(); // 기본 생성자가 내장되어 있기 때문에 선언이 가능하다.
        System.out.println(main.getNumber());
        System.out.println(main.getNumber());
    }

    // 기본 생성자. 기본생성자는 뭐라고? 생략이 가능하다.

    public Main() {}

    //메서드 선언
    public int getNumber() {
        // [ 지역변수 ]   <-> 전역변수 는 static과 거의 비슷하다.
        // 해당 메서드가 실행될 때 마다 독립적인 값을 저장하고 관리한다.
        // 이 지역변수는 메서드 내부에서 정의될 때 생성된다.
        // 이 메서드가 종료될 때 소멸된다.
        int number = 1;
        number += 1; // number = number +1 과 같은 말이다
        return number;
    }
}
