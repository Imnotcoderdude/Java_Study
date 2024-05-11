package Other_Study.This_is_Java_my.상속;
// 부모클래스
public class Phone {
    // 부모 클래스의 필드 선언
    public String model;
    public String color;

    // 메소드 선언
    public void bell() {
        System.out.println("벨이 울립니다");
    }
    public void sendVoice(String messege) {
        System.out.println("본인 : " + messege);
    }
    public void receiveVoice(String messege) {
        System.out.println("상대방 : " + messege);
    }
    public void hangUp() {
        System.out.println("전화를 끊어버립니다");
    }
}
