package Other_Study.This_is_Java_my.추상메소드;

public class Main {
    public static void main(String[] args) {
    // 인터페이스 변수 생성
        RemoteControl rc;


        //rc 객체를 사용해서 Television 사용
        rc = new Television();
        rc.turnOn();
        rc.setVolume(50);
        rc.turnOff();

        // rc 객체를 Audio로 전환
        rc = new Audio();
        rc.turnOff();
        rc.setVolume(200);
        rc.turnOff();
    }

}
