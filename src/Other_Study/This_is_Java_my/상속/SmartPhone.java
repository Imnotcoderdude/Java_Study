package Other_Study.This_is_Java_my.상속;
// Phone을 상속받아서 사용하는 자식클래스
public class SmartPhone extends Phone {
    public boolean wifi;

    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        if (wifi == true) {
            System.out.println("와이파이 연결");
        } else {
        System.out.println("와이파이 없음");}
    }
    public void internet() {
        System.out.println("인터넷에 연결됩니다");
    }
}
