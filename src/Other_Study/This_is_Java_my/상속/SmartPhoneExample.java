package Other_Study.This_is_Java_my.상속;
// 상속받은 자식 클래스를 객체화 해서 사용하는 부분
public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("아이폰","스페이스그레이");

        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);

        System.out.println("와이파이 상태 : " + myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕하세요 저는 스팸입니당");
        myPhone.sendVoice("잘못거셨습니당~");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
