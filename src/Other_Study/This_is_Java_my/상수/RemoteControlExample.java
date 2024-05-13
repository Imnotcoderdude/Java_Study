package Other_Study.This_is_Java_my.상수;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 메인 메소드 내에서 객체화 시키지 않아도 상수필드 가져와서 사용하기 가능함
        // 상수필드이기에 값은 고정임
        System.out.println("리모컨 최대 볼륨 : [" + RemoteControl.MAX_VOLUME+"]" );
        System.out.println("리모컨 최대 볼륨 : [" + RemoteControl.MIN_VOLUME+"]" );

        int max = RemoteControl.MAX_VOLUME;

        System.out.println(max);
        System.out.println(RemoteControl.MAX_VOLUME);

    }
}
