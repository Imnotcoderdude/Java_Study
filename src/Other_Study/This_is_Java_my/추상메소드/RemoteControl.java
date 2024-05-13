package Other_Study.This_is_Java_my.추상메소드;

public interface RemoteControl {
    // 상수필드 public.static.flinal은 생략이 가능함
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    abstract void turnOn();
    abstract void turnOff();
    void setVolume(int volume);
}
