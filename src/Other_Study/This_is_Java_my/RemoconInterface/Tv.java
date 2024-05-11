package Other_Study.This_is_Java_my.RemoconInterface;

public class Tv implements RemoteControl {
    // 인터페이스에 있는 turnOn을 재정의 해야하기 때문에 오버라이드 해서 재정의함
    @Override // 어노테이션?
    public void tunOn() {
        System.out.println("티비를 켭니다");
    }
}
