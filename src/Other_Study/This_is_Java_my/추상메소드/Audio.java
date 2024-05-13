package Other_Study.This_is_Java_my.추상메소드;

public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio의 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio의 전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
            System.out.print("최대 볼륨을 넘을 수 없습니다. ");
            System.out.println("입력받은 볼륨 : " + volume);
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
            System.out.print("최소볼륨보다 작을 수 없습니다. ");
            System.out.println("입력받은 볼륨 : " + volume);
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio볼륨 : " + this.volume);

    }
}
