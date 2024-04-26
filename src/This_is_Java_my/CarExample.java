package This_is_Java_my;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("모델명 : " + myCar.model);
        System.out.println("엔진 : " + myCar.engine);
        System.out.println("속도 : " + myCar.speed);
        System.out.println("시동걸렸는지? : "+myCar.start);
        System.out.println("타이어 : "+ myCar.tire);
        System.out.println("기어변속 : " + myCar.flutterSound);


        myCar.speed = 300; // 외부 객체에서 필드값 변경하는 방법.
        System.out.println("증속 : "+ myCar.speed);

        //깃 테스트
        System.out.println("깃테스트 : ");
    }
}
