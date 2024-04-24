package Week03.thisFolder;

public class Car {
    // 스태틱 파이널 : 상수로서 존재하기 때문에 모든 Car 는 제네시스 모델이다.
    static final String COMPANY = "GENESIS"; // 자동차 회사 : GENESIS
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    double speed;  // 자동차 속도 , km/h
    char gear = 'P'; // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태


    public Car(String model) {
        this(model, "Blue", 50000000);// 현재 그 객체 자신
    }

    public Car(String model, String color) {
        this(model, color, 100000000);
    }

    public Car(String model, String color, double price) {
        this.model = model;
        this.color = color; // 생성자는 무언가를 만드는 역할.인스턴스, 인스턴스 필드들 초기화, 기본생성자는 오버로딩된 생성자가 없을떄 컴파일러가 자동으로 만들어줌
        this.price = price; // 본인이 속한 클래스의 필드값, 파라미터로 받아온 값, 지역변수(내가직접만든)
    }

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal() {
        speed = 0;
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    void horn() {
        System.out.println("빵빵");
    }

    Car returnInstance() {
        return this;
    }
}
