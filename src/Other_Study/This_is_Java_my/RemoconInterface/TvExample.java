package Other_Study.This_is_Java_my.RemoconInterface;

public class TvExample {
    public static void main(String[] args) {
        RemoteControl rc;
        // rc 변수에 Tv 객체를 대입해서 사용
        rc = new Tv(); // 이 자리에는 아무 객체나 올 수 있는 것이 아닌 인터페이스로 사용이 가능한 객체만 가능하다.
        rc.tunOn();
        // rc 변수에 Audio 객체를 대입해서 사용
        rc = new Audio();
        rc.tunOn();
        // 인터페이스에 존재하는 상수 필드는 바로 가져와서 사용하는 것이 가능하다.
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);
    }
}
