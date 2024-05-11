package Other_Study.This_is_Java_my.RemoconInterface;
    // 인터페이스
public interface RemoteControl {
    // 추상 메소드
    // public, abstract 는 생략이 가능하다 인터페이스의 추상메소드는 기본이 디폴트가 아닌 퍼블릭이기 때문이다.
    public abstract void tunOn();

    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

}
